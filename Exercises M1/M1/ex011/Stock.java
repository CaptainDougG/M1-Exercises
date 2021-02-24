package ex011;

public class Stock {
	
	public String tickerSymbol;
	public String companyName;
	public int price;
	public double percentChange = 0;
	public int totalShares;
	public long marketCap = 0;
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		marketCap = (totalShares * price);
	}
	
	public void adjustPrice(int change) {
		percentChange = (change / (float)price) * 100;
		price = price + change;
		marketCap = (totalShares * price);
	}
	
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol +"\nCompany: " + companyName + "\nCurrent Price: " + price + "\nMarket Cap: "+ marketCap;
	}
}
