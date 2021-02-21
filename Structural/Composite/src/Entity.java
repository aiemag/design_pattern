
public abstract class Entity {
	public abstract String getName();
	
	protected abstract void printList();
	
	public void add(Entity entity) {}
	
	public String toString() {
		return getName();
	}
}
