package idcard;
import framework.Product;

public class IDCard extends Product{
	private String owner;
	
	IDCard(String owner){
		System.out.println(owner + "'s card is being made.");
		this.owner = owner;
	}
	
	public void use() {
		System.out.println(owner + "'s card is used.");
	}
	public String getOwner() {
		return owner;
	}
}
