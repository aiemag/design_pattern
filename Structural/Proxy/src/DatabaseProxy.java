
public class DatabaseProxy implements Queryable{
	private String name;
	private Database real;
	
	public DatabaseProxy(String name) {
		this.name = name;
	}
	
	public String getDatabaseName() {
		return this.name;
	}
	
	public void query(String queryString) {
		realize();
		real.query(queryString);
	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new Database(name);
		}
	}
}
