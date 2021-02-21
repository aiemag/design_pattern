
public class ConcreteWrapping extends Wrapping{
	public ConcreteWrapping(Chocolate chocolate) {
		super(chocolate);		
	}
	
	public int getWidth() {
		return 1 + chocolate.getWidth() + 1;
	}
	
	public int getHeight() {
		return 1 + chocolate.getHeight() + 1;
	}
	
	public String getName(int rowIndex) {
		if(rowIndex==0 || rowIndex == chocolate.getHeight() + 1) {
			return "+" + wrap('-', chocolate.getWidth()) + "+";
					
		}else {
			return "|" + chocolate.getName(rowIndex - 1) + "|";
		}
	}
	
	private String wrap(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for(int i=0 ; i<count ; i++) {
			buf.append(ch);
		}
		
		return buf.toString();
	}
}
