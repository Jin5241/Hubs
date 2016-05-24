package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static Connection connection = null;
	private static Statement statement = null;

	public static boolean connect() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:res\\HUBS.db");
		} catch (SQLException e) {
			return false;
		}
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			return false;
		}
		return true;
	}

	public static ResultSet executeSelect(String sql) {
		try {
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			return null;
		}
	}

	public static boolean executeNonSelect(String sql) {
		try {
			return statement.execute(sql);
		} catch (SQLException e) {
			return false;
		}
	}
}