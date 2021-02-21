
public class Main {

	public static void main(String[] args) {
		Printer p = new Printer(new StringPrinterImpl("printer test"));
		p.display();
		
		NewPrinter np = new NewPrinter(new StringPrinterImpl("new printer test"));
		np.displayMulti(5);
	}
}
