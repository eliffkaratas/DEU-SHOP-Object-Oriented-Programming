
public abstract class Product implements IProduct {
	private String type;
	private String product_Name;
	private double price;
	private int size;
	private String colour;
	private boolean isBottom;
	private String rating;
	private int selling_count;
	private int ID;
	private static int unique_ID = 0;
	private Seller whoIsSelling;

	public Product(Seller seller, String type, String product_Name, double price, int size, String colour,
			boolean isBottom) {
		this.type = type;
		this.product_Name = product_Name;
		this.price = price;
		this.size = size;
		this.colour = colour;
		this.isBottom = isBottom;
		this.rating = " - ";
		this.selling_count = 0;
		whoIsSelling = seller;
		ID = unique_ID;
		unique_ID++;
	}

	public Seller getWhoIsSelling() {
		return whoIsSelling;
	}

	public void setWhoIsSelling(Seller whoIsSelling) {
		this.whoIsSelling = whoIsSelling;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isBottom() {
		return isBottom;
	}

	public void setBottom(boolean isBottom) {
		this.isBottom = isBottom;
	}

	public String getRating() {
		return Rating();
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getSelling_count() {
		return selling_count;
	}

	public void setSelling_count(int selling_count) {
		this.selling_count = selling_count;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public static int getUnique_ID() {
		return unique_ID;
	}

	public static void setUnique_ID(int unique_ID) {
		Product.unique_ID = unique_ID;
	}

	@Override
	public void sendToCargo(Customer Customer, Seller Seller, Date sendDate, Date receiveDate) {
		for (int i = 0; i < DEUSHOP.getDEC().getWorkers().length; i++) {
			if (DEUSHOP.getDEC().getWorkers()[i].getCurrentPacketCount() < 10) {
				Packet P = new Packet(Customer, Seller, sendDate, receiveDate, price, DEUSHOP.getDEC().getWorkers()[i]);
				P.setStatus("InCargo");
				Seller.getOrders().enqueue(P);
				int a = Seller.getReliability();
				Seller.setReliability(a++);
				DEUSHOP.getDEC().getWorkers()[i].addDistribution_order(P);
				DEUSHOP.getStorage().push(P);
				break;
			}
		}
	}

	@Override
	public void sell(Customer C) {
		int size = C.getBasket().size();
		Stack temp = new Stack(size);
		for (int i = 0; i < size; i++) {
			Product P = (Product) C.getBasket().peek();
			if (P.getID() == ID) {
				C.getBasket().pop();
			} else {
				temp.push(C.getBasket().pop());
			}
		}

		for (int i = 0; i < size - 1; i++) {
			C.getBasket().push(temp.pop());
		}
		DEUSHOP.getProducts().remove(ID);

		selling_count++;

		Rating();
		int a = C.getType_points();
		C.setType_points(a++);

	}

	@Override
	public String Rating() {
		if (selling_count >= 10) {
			rating = "*****";
		} else if (selling_count < 10 && selling_count >= 8) {
			rating = "****";
		} else if (selling_count < 8 && selling_count >= 6) {
			rating = "***";
		} else if (selling_count < 6 && selling_count >= 4) {
			rating = "**";
		} else if (selling_count < 4 && selling_count >= 2) {
			rating = "*";
		} else if (selling_count < 2 && selling_count >= 1) {
			rating = " - ";
		}
		return rating;
	}

	@Override
	public double makeDiscount(double amount) {
		double newPrice = 0;
		newPrice = price - (price * amount) / 100;
		price = newPrice;
		return newPrice;
	}

	public void addToBasket(Customer C) {
		Node temp = DEUSHOP.getProducts().getHead();		
		if (temp == null)
			System.out.println("List is empty.");
		while (temp != null) {			
			Product m = (Product) temp.getO();
			int id = m.getID();
			if (id == ID) {				
				C.getBasket().push(temp.getO());
				break;
			}
			temp=temp.getLink();
		}
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", product_Name=" + product_Name + ", price=" + price + ", size=" + size
				+ ", colour=" + colour + ", ID=" + ID + ", isBottom=" + isBottom + ", rating=" + Rating() + "]";
	}
}
