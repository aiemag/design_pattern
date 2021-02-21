
public class Computer {

	public static void main(String[] args) {
		PowerConnector pc = new Adapter();
		pc.connectTo220VType();
	}
}
