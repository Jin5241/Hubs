package dao;


import java.sql.*;

public class DBConnection
{
  public static void main( String args[] )
  {
    Connection c = null;
    try {
    	c=DriverManager.getConnection("D:\SQLite\test.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
}