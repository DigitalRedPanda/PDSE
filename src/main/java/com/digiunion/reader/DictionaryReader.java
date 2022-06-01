package com.digiunion.reader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryReader implements IDictionaryReader {

  Map<String, String> wordMap;

  public DictionaryReader() throws IOException {
    wordMap = new ConcurrentHashMap<>();
    try (var lines = Files.lines(Path.of(new File("source\\Dictionary.txt").getAbsolutePath()))) {
      wordMap = lines.map(line -> line.split(":"))
          .collect(Collectors.toConcurrentMap(line -> line[0], line -> line[1].trim()));
    }
  }

  @Override
  public Optional<String> find(String term) throws IOException {
    // try (var line = Files.lines(Path.of(new
    // File("source\\Dictionary.txt").getCanonicalPath()),
    // StandardCharsets.UTF_8)) {
    // line.parallel().map(fileLine -> fileLine.split(":"))
    // .filter(fileLine -> fileLine[0].equalsIgnoreCase(term))
    // .forEach(fileLine -> System.out.printf("%s which means %s", fileLine[0],
    // fileLine[1].trim()));
    // }
    return Optional.of(wordMap.get(term));
  }

}
