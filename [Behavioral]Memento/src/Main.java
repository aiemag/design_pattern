import game.Gamer;
import game.Memento;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		
		for(int i=0 ; i<100 ; i++) {
			System.out.println("==== "+i);
			System.out.println("Status : "+gamer);
			
			gamer.bet();
			
			System.out.println("Money : "+gamer.getMoney());
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("Let's save the money.");
				memento = gamer.createMemento();
			}else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("Let's restore the money.");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
			System.out.println("");			
		}
	}
}
