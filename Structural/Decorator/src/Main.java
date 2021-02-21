
public class Main {
	public static void main(String[] args) {
		Chocolate c = new ConcreteWrapping(
						  new ConcreteWrapping(
							  new ConcreteChocolate("Dark Chocolate")
					      )						  
					  );
		
		c.display();
	}
}