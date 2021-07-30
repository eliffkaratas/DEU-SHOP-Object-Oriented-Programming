
public class Seller extends Person {
	private Queue orders = new Queue(1000);
	private int reliability = 0;
	private List toBeSold;

	public Seller(String name, String surname, String mail, Phone phone_number, String gender, Adress address,
			Date date) {
		super(name, surname, mail, phone_number, gender, address, date);
	}

	public Queue getOrders() {
		return orders;
	}

	public void setOrders(Queue orders) {
		this.orders = orders;
	}

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}

	public List getToBeSold() {
		return toBeSold;
	}

	public void setToBeSold(List toBeSold) {
		this.toBeSold = toBeSold;
	}

	public void listToBeSoldItems() {
		Node temp = toBeSold.getHead();
		if (temp == null)
			System.out.println("List is empty.");
		while (temp != null) {
			Man_Product m = (Man_Product) temp.getO();
			System.out.println(m.toString());
			temp = temp.getLink();
		}
	}

	public void SearchInToBeSold(int ID) {
		boolean flag = true;
		Node temp = toBeSold.getHead();
		if (temp == null)
			System.out.println("List is empty.");
		while (temp != null) {
			Man_Product m = (Man_Product) temp.getO();
			int id = m.getID();
			if (id == ID) {
				System.out.println(m.toString());
				flag = false;
				break;
			}
			temp = temp.getLink();
		}
		if (!flag) {
			System.out.println("NOT FOUND.");
		}

	}

	public void deleteInToBeSold(int ID) {
		toBeSold.remove(ID);
	}
	
	public String toString() {
		return "Seller [Name=" + getName() + ", Surname=" + getSurname() + ", ID=" + getId() + "]";
	}
}
