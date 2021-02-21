
public class Printer {
	
	private PrinterImpl impl;
	
	public Printer(PrinterImpl impl) {
		this.impl = impl;
	}
	
	protected void print() {
		impl.spreadInk();
	}
	
	public void display() {
		print();
	}
}
