
public class Database implements Queryable{
	private String name;
	
	public Database(String name){
		this.name = name;		
	}
	
	public String getDatabaseName() {
		return this.name;
	}
	
	public void query(String queryString) {
		System.out.println("Query is : "+queryString);
		process();
	}
	
	private void process() {
		System.out.println("Getting data from server.");
		for(int i=0 ; i<3 ; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(".");
		}
		System.out.println("Done.");
	}
}
