
public class Customer extends Person{
	private Stack basket = new Stack(10);
	private String type;
	private int type_points = 0;
	
	public Customer(String name, String surname, String mail, Phone phone_number, String gender, Adress address, Date date) {
		super(name,surname,mail,phone_number,gender,address,date);
	}

	public String getType() {
		return type;
	}
	
	public String setType() {
		if(type_points >= 10) {
			type = "shopaholic";
		}
		else if(type_points < 10 && type_points >= 5) {
			type = "interested shopping";
		}
		else
			type = "calm";
		return type;
	}
	
	public int getType_points() {
		return type_points;
	}
	
	public void setType_points(int type_points) {
		this.type_points = type_points;
	}

	public Stack getBasket() {
		return basket;
	}

	public void setBasket(Stack basket) {
		this.basket = basket;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + getName() + ", Surname=" + getSurname() + ", ID=" + getId() + "]";
	}

	
	
}
