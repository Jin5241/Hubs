package BL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CA {

	private static Map<Integer, CA> cas = new HashMap<Integer, CA>();
	private static int count=0;

	private int id;
	private String nameen;
	private String namezh;
	private String namede;
	private double price;
	private String detailen;
	private String detailzh;
	private String detailde;
	private String tipsen;
	private String tipszh;
	private String tipsde;
	private int rate;
	private String shoplink;
	private Tag tag;
	private List<String> remarks;
	
	private int relevance=0;
	

	public static void storeCA(CA ca) {
		cas.put(ca.id, ca);
	}
	
	public static void deleteCA(CA ca) {
		cas.remove(ca.id);
	}

	public static CA getCA(int id) {
		return cas.get(id);
	}
	
	public static void increaseCount(){
		count++;
	}
	
	public static int getCount(){
		return count;
	}
	
	public void addRemark(String remark){
		remarks.add(remark);
	}

	public int getId() {
		return id;
	}

	public String getNameen() {
		return nameen;
	}

	public String getNamezh() {
		return namezh;
	}

	public String getNamede() {
		return namede;
	}

	public double getPrice() {
		return price;
	}

	public String getDetailen() {
		return detailen;
	}

	public String getDetailzh() {
		return detailzh;
	}

	public String getDetailde() {
		return detailde;
	}

	public int getRate() {
		return rate;
	}

	public String getShoplink() {
		return shoplink;
	}

	public CA(int id, String nameen, String namezh, String namede, double price, String detailen, String detailzh,
			String detailde, String tipsen, String tipszh, String tipsde, int rate, String shoplink, Tag tag) {
		this.id = id;
		this.nameen = nameen;
		this.namezh = namezh;
		this.namede = namede;
		this.price = price;
		this.detailen = detailen;
		this.detailzh = detailzh;
		this.detailde = detailde;
		this.tipsen = tipsen;
		this.tipszh = tipszh;
		this.tipsde = tipsde;
		this.rate = rate;
		this.shoplink = shoplink;
		this.tag = tag;
		this.remarks = new ArrayList<String>();
		increaseCount();
	}
	
	public void setRelevance(int r){
		this.relevance=r;
	}
	
	public int getRelevance(){
		return this.relevance;
	}

	public static Collection<CA> getCollection() {
		return cas.values();
	}

	public String getTipsen() {
		return tipsen;
	}

	public String getTipszh() {
		return tipszh;
	}

	public String getTipsde() {
		return tipsde;
	}

	public Tag getTag() {
		return tag;
	}

	public List<String> getRemarks() {
		return remarks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nameen;
	}
}