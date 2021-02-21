
public class NewPrinter extends Printer{
	
	public NewPrinter(PrinterImpl impl) {
		super(impl);
	}
	
	public void displayMulti(int count) {
		for(int i=0 ; i<count ; i++) {
			print();
		}
	}
}