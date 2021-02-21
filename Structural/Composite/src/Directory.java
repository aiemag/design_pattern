import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entity{
	private String name;
	private ArrayList entities = new ArrayList();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected void printList() {
		System.out.println("/" + this);
		
		Iterator it = entities.iterator();
		while(it.hasNext()) {
			Entity entity = (Entity)it.next();
			entity.printList();
		}
	}
	
	public void add(Entity entity) {
		entities.add(entity);
	}
}
