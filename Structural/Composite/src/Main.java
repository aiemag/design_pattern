
public class Main {

	public static void main(String[] args) {
		Directory rootDir = new Directory("root");		
		Directory usrDir = new Directory("usr");
		Directory binDir = new Directory("bin");
		
		rootDir.add(usrDir);
		rootDir.add(binDir);
		
		usrDir.add(new File("test1.txt"));
		usrDir.add(new File("test2.txt"));
		
		rootDir.printList();
	}
}
