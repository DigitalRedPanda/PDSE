package com.digiunion.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public non-sealed class DictionaryReader implements IDictionaryReader {

  Map<String, String> wordMap;

  public DictionaryReader() throws IOException {
    wordMap = new HashMap<>();
    try (var lines = Files.lines(Path.of("source\\Dictionary.txt"))) {
      wordMap = lines.map(line -> line.split(":"))
          .collect(Collectors.toMap(line -> line[0], line -> line[1].trim()));
    }
  }

  @Override
  public Optional<String> find(String term) throws IOException {
    return Optional.ofNullable(wordMap.get(term));
  }

}
