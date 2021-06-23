import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Brown");
		Product card2 = factory.create("Jack");
		Product card3 = factory.create("Bill");
		card1.use();
		card2.use();
		card3.use();
	}
}
