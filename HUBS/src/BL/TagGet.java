package BL;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Visitor;

public class TagGet {

	public static void storeAllTags() {
		ResultSet rs=Visitor.GetAllTag();
		try {
			while (rs.next()) {
				Tag.storeTag(new Tag(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
		}
	}
}