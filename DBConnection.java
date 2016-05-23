package dao;

import java.sql.*;

public class DBConnection {
	public static void main(String args[]) {
		try {
			Class.forName("org.sqlite.JDBC");
			// System.out.println("Load sqlite Driver sucess!");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("Fail to Load sqlite Driver!");
			System.out.println(e.getMessage());
		}
		try {
			String connectionString = "jdbc:sqlite:./CA.db";
			Connection cn = DriverManager.getConnection(connectionString);
			// System.out.println("Connect sucessfully!");
		} catch (SQLException e) {
			System.out.println("Fail£¡");
			System.out.println(e.getMessage());
		}

	}
}