
public class Child_Product extends Product {

	public int yearsOld;

	Child_Product(Seller seller,String type, String product_Name, double price, int size, String colour, boolean isBottom,int yearsOld) {
		super(seller,type, product_Name, price, size, colour, isBottom);
		this.yearsOld = yearsOld;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	@Override
	public String toString() {
		return "Child_Product [yearsOld=" + yearsOld + ", getYearsOld()=" + getYearsOld() + ", getType()=" + getType()
				+ ", getProduct_Name()=" + getProduct_Name() + ", getPrice()=" + getPrice() + ", getSize()=" + getSize()
				+ ", getColour()=" + getColour() + ", isBottom()=" + isBottom() + ", getRating()=" + getRating()
				+ ", getSelling_count()=" + getSelling_count() + ", getID()=" + getID() + ", Rating()=" + Rating()
				+ "]";
	}

}
