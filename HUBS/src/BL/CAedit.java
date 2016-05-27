package BL;

import dao.Modifier;

public class CAedit {
public static void editCA(int Oid,CA NCA){
	CA.storeCA(NCA);
	Modifier.editCA(Oid, NCA);
} 
public static void addCA(CA ca) {
	CA.storeCA(ca);
	Modifier.addCA(ca);
}
public static Object deleteCA(int id) {
	return null;
	
}
}
