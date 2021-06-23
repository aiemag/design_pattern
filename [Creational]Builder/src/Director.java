
public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("In the morning and during the day");
		builder.makeItems(new String[] {
			"Good Morning.",
			"Hello.",
		});
		builder.makeString("at the night");
		builder.makeItems(new String[] {
			"Hello.",
			"Good night.",
			"Good bye",
		});
		builder.close();
	}
}
