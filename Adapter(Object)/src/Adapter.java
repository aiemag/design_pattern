
public class Adapter implements PowerConnector{
		
	ElectricOutlet electricOutlet;
	public void connectTo220VType() {
		electricOutlet.connectTo110VType();
	}
}
