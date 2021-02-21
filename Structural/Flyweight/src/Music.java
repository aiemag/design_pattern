import java.util.Random;

public class Music {
	private String lyrics;
	private Random random = new Random();
	
	public Music(String title) {
		lyrics = title + "'s lyrics : ";
		
		for(int i=0 ; i<100 ; i++) {
			lyrics += random.nextInt(100);
		}
		
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void showLyrics() {
		System.out.println(lyrics);
	}
}
