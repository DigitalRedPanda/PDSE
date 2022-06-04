package com.digiunion.database.reader;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.digiunion.database.config.DatabaseConfiguration;

public class DatabaseReader {

 private Connection connection;

 public DatabaseReader() throws ClassNotFoundException, SQLException {
  connection = new DatabaseConfiguration().getConnection();
 }

 public Optional<String> read(String term) throws SQLException {

  return Optional.of(term);
 }
}