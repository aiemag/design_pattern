
public class StringPrinterImpl extends PrinterImpl{
	
	private String string;
	
	public StringPrinterImpl(String string) {
		this.string = string;
	}
	
	public void spreadInk() {
		System.out.println(string);
	}
}