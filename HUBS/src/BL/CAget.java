package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.Visitor;

public class CAget {

	public static List searchCA(String Keyw) throws SQLException {
		return null;
	}

	public static void storeAllCA() {
		ResultSet rs = Visitor.GetAllAgent();
		try {
			while (rs.next()) {
				Tag tag=Tag.getTag(rs.getInt(14));
				CA ca=new CA(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12), rs.getString(13), tag);
				CA.storeCA(ca);
				tag.addRelativeAgent(ca);
			}
		} catch (Exception e) {
		}
	}
}
