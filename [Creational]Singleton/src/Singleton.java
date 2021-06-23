
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Instance has been made.");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
