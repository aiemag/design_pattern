
public class Main {
	public static void main(String args[]) {
		
		MusicFactory mf = MusicFactory.getInstance();		
		mf.getMusic("Let it be");
		mf.getMusic("The rain");
		mf.getMusic("Oasis");
		
		Music chosen = mf.getMusic("The rain");
		chosen.showLyrics();
	}
}
