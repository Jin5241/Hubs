package BL;

import java.util.HashMap;
import java.util.Map;

public class Tag {
	
	private static Map<Integer, Tag> tags=new HashMap<Integer, Tag>();
	
	private int id;
	private String nameen;
	private String namezh;
	private String namede;
	private Map<Integer, CA> relativeAgents;

	public static void storeTag(Tag tag){
		tags.put(tag.id, tag);
	}
	
	public static Tag getTag(int id){
		return tags.get(id);
	}
	
	public void addRelativeAgent(CA ca){
		relativeAgents.put(ca.getId(), ca);
	}

	public Tag(int id, String nameen, String namezh, String namede) {
		this.id = id;
		this.nameen = nameen;
		this.namezh = namezh;
		this.namede = namede;
		this.relativeAgents = new HashMap<Integer, CA>();
	}

	public static Map<Integer, Tag> getTags() {
		return tags;
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

	public Map<Integer, CA> getRelativeAgents() {
		return relativeAgents;
	}
}