
public abstract class Chocolate {
	public abstract int getWidth();	
	public abstract int getHeight();	
	public abstract String getName(int rowIndex);
	
	public final void display() {
		for(int i=0 ; i<getHeight() ; i++) {
			System.out.println(getName(i));
		}
	}
}
