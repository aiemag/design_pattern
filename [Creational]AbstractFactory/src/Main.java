import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {

	public static void main(String[] args) {
		
		Factory factory = Factory.getFactory("listfactory.ListFactory");
		
		Link koreaherald = factory.createLink("Korea Herald", "http://www.koreaherald.com/");
		Link cnn = factory.createLink("CNN", "https://edition.cnn.com/");
		
		Link naver = factory.createLink("NAVER", "https://www.naver.com/");
		Link google = factory.createLink("GOOGLE", "https://www.google.com/");
		
		Tray traynews = factory.createTray("NEWS");
		traynews.add(koreaherald);
		traynews.add(cnn);
		
		Tray traysearch = factory.createTray("SEARCHING ENGINE");
		traysearch.add(naver);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "Anonymous");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		
	}

}
