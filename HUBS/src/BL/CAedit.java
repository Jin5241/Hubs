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
public static void deleteCA(int id,CA ca) {
	CA.deleteCA(ca);
	Modifier.deleteCA(id);
}
}