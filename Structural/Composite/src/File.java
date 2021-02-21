
public class File extends Entity{
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void printList() {
		System.out.println("/" + this);
	}
}