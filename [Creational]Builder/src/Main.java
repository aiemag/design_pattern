
public class Main {

	public static void main(String[] args) {
		//HTMLBuilder hb = new HTMLBuilder();
		TextBuilder tb = new TextBuilder();
		Director director = new Director(tb);
		director.construct();
		String result = tb.getResult();
		System.out.println(result);
	}
}