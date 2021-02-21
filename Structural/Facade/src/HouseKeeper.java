
public class HouseKeeper {
	private String houseName;
	
	public HouseKeeper(String houseName) {
		this.houseName = houseName;
	}
	
	public void talk() {
		System.out.println(this.houseName+" was built in 1982.");
	}
	
	public void guide() {
		talk();
		Room.lookAround(this.houseName);
	}
}
