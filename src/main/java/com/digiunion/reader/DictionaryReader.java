package com.digiunion.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryReader implements IDictionaryReader {

 @Override
 public void read(File file) throws IOException {
  try (var reader = new BufferedReader(new FileReader("source\\Dictionary.txt"))) {

  }
 }
}