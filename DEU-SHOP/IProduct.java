
public interface IProduct {
	public void sendToCargo(Customer Customer,Seller Seller,Date D1,Date D2);

	public void sell(Customer C);
	
	public void addToBasket(Customer C);

	public String Rating();

	public double makeDiscount(double amount);

	public String toString();
	
	
	
}
