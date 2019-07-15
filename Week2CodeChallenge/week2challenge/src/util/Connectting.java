package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Connectting {
    public static Connection getConnection()
    {
      try {

          return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException e) {
          throw new RuntimeException("Error connecting to the database", e);
      }
    }
}
