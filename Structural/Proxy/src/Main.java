
public class Main {
	public static void main(String[] args) {		
		Queryable q = new DatabaseProxy("YourSQL");
		System.out.println("Current Databse : "+q.getDatabaseName());
		q.query("DESC TABLE;");
	}
}
