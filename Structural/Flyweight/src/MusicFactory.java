import java.util.HashMap;

public class MusicFactory {
	private HashMap pool = new HashMap();
	private static MusicFactory singleton = new MusicFactory();
	private MusicFactory() {}
	
	public static MusicFactory getInstance() {
		return singleton;
	}
	
	public synchronized Music getMusic(String title) {
		Music music = (Music)pool.get(title);
		if(music==null) {
			music = new Music(title);
			pool.put(title, music);
		}
		return music;
	}
}
