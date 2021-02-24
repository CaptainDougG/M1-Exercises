package ex010;

public class StoreProduct {
	
	//Instance variables
	public String lable;
	public int price;
	public String category = "misc";
	public boolean hasExpiration = false;
	public int stock = 0;
	
	//Constructors
	public StoreProduct(String lable, int price, String category, boolean hasExpiration, int stock) {
		this.lable = lable;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
	}
	
	public StoreProduct(String lable, int price, int stock) {
		this.lable = lable;
		this.price = price;
		this.stock = stock;
	}
	
	public StoreProduct(String lable, int price) {
		this.lable = lable;
		this.price = price;
	}
	
	public StoreProduct(String lable, int price, String category, boolean hasExpiration) {
		this.lable = lable;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
	}
	
	
	public void setExpired(boolean hasExpired) {
		if (hasExpired == true) {
			stock = 0;
		}
	}
	
	public boolean makeSale(int quantity) {
		if (quantity <= stock) {
			stock = stock - quantity;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getDiscountedPrice(double discount) {
		return price * (1- discount);
	}
}
