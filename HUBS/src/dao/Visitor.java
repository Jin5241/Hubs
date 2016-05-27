package dao;

import java.sql.ResultSet;

public class Visitor {

	public static ResultSet GetAllAgent() {
		ResultSet rs = DBConnection.executeSelect("select * from CA");
		return rs;
	}

	public static ResultSet GetAllTag(){
		ResultSet rs = DBConnection.executeSelect("select * from Tag");
		return rs;
	}

	public static ResultSet searchsql(String keyw){
		ResultSet rs = DBConnection.executeSelect("select * from CA_Name_CH='" + keyw + "'");
		return rs;
	}
}