package BL;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import dao.DBConnection;
import dao.Visitor;

public class CAget {

	public static List<CA> searchCA(String keyw){
		List<CA> tempList=new ArrayList<CA>();		
		for(CA ca:CA.getCollection()){
			int count=0;
			String[] temp=keyw.split(" ");
			for(String s:temp){
				if(isInCA(s, ca)){
					count++;
				}
			}
			if(count>0){
				ca.setRelevance(count);
				tempList.add(ca);
			}
		}
		tempList.sort(new Comparator<CA>() {

			@Override
			public int compare(CA o1, CA o2) {
				int r1=o1.getRelevance();
				int r2=o2.getRelevance();
				if(r1==r2){
					return 0;
				}
				else{
					return r1>r2?-1:1;
				}
			}
		});
		return tempList;
	}

	public static void storeAllCA() {
		ResultSet rs = Visitor.GetAllAgent();
		try {
			while (rs.next()) {
				Tag tag=Tag.getTag(rs.getInt(14));
				CA ca=new CA(rs.getInt(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getString(6),
						rs.getString(7), rs.getString(8), 
						rs.getString(9), rs.getString(10),
						rs.getString(11), rs.getInt(12),
						rs.getString(13),tag);
				CA.storeCA(ca);
				tag.addRelativeAgent(ca);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static boolean isInCA(String keyw, CA ca){
		String pattern="\\p{ASCII}*"+keyw+"\\p{ASCII}*";
		
		boolean b= ca.getNameen().matches(pattern)||ca.getNamede().matches(pattern)|ca.getNamezh().matches(pattern);
		return b;
	}
	
	public static void main(String[] args) {
		DBConnection.connect();
		TagGet.storeAllTags();
		storeAllCA();
		for(CA ca:searchCA("Star Green Besom")){
			System.out.println(ca.getNameen());
		}
	}
}
