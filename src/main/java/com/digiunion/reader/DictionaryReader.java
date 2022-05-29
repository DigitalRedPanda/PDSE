package com.digiunion.reader;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DictionaryReader implements IDictionaryReader {

  @Override
  public void find(String term) throws IOException {
    try (var line = Files.lines(Path.of(new File("source\\Dictionary.txt").getCanonicalPath()),
        StandardCharsets.UTF_8)) {
      line.parallel().map(fileLine -> fileLine.split(":"))
          .filter(fileLine -> fileLine[0].equalsIgnoreCase(term))
          .forEach(fileLine -> System.out.printf("%s which means %s", fileLine[0], fileLine[1]));
    }
  }

}
