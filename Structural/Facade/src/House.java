
public class House {
	public House() {}
	
	public static void enterToGate(String houseName) {
		HouseKeeper hk = new HouseKeeper(houseName);
		hk.guide();
	}
}
