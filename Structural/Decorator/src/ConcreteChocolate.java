
public class ConcreteChocolate extends Chocolate{
	private String name;
	
	public ConcreteChocolate(String name) {
		this.name = name;
	}
	
	public int getWidth() {
		return this.name.getBytes().length;
	}
	public int getHeight() {
		return 1;
	}
	
	public String getName(int rowIndex) {
		if(rowIndex==0) return name;
		else return null;
	}
}
