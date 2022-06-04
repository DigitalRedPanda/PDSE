package com.digiunion.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.Getter;

public final class DatabaseConfiguration {

  public DatabaseConfiguration() throws SQLException, ClassNotFoundException {
    connection = DriverManager.getConnection("jdbc:sqlite:..\\sources\\Dictionary.db");
  }

  @Getter
  private Connection connection;

}
