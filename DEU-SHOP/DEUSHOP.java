import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DEUSHOP {
	private static Person[] persons;
	private static List products;
	private static Stack storage;
	private static DECargo DEC;
	private static int Capacity;

	public DEUSHOP(int capacity) {
		Capacity = capacity;
		persons = new Person[capacity];
		products = new List();
		storage = new Stack(capacity);
		DEC = new DECargo(capacity);

	}

	public static Person[] getPersons() {
		return persons;
	}

	public static void setPersons(Person[] persons) {
		DEUSHOP.persons = persons;
	}

	public static List getProducts() {
		return products;
	}

	public static void setProducts(List products) {
		DEUSHOP.products = products;
	}

	public static Stack getStorage() {
		return storage;
	}

	public static void setStorage(Stack storage) {
		DEUSHOP.storage = storage;
	}

	public static int getCapacity() {
		return Capacity;
	}

	public static void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public static DECargo getDEC() {
		return DEC;
	}

	public static void setDEC(DECargo dEC) {
		DEC = dEC;
	}

	public void List(int selection) {
		Node temp;
		switch (selection) {

		case 1:
			// CargoWorker
			DEC.ListWorkers();
			break;
		case 2:
			// Customer
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] != null && persons[i].getClass() == Customer.class) {
					System.out.println(persons[i].toString());
				}
			}
			break;
		case 3:
			// Seller
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] != null && persons[i].getClass() == Seller.class) {
					System.out.println(persons[i].toString());
				}
			}
			break;
		case 4:

			break;
		case 5:
			// Man_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				if (temp.getO().getClass() == Man_Product.class) {
					Man_Product m = (Man_Product) temp.getO();
					System.out.println(m.toString());
				}
				temp = temp.getLink();
			}
			break;
		case 6:
			// Women_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				if (temp.getO().getClass() == Women_Product.class) {
					Women_Product m = (Women_Product) temp.getO();
					System.out.println(m.toString());

				}
				temp = temp.getLink();
			}
			break;
		case 7:
			// Child_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				if (temp.getO().getClass() == Child_Product.class) {
					Child_Product m = (Child_Product) temp.getO();
					System.out.println(m.toString());

				}
				temp = temp.getLink();
			}
			break;
		case 8:
			int size = storage.size();
			Stack s = new Stack(size);
			for (int i = 0; i < size; i++) {
				Packet P = (Packet) storage.peek();
				System.out.println(P.toString());
				s.push(storage.pop());

			}

			for (int i = 0; i < size; i++)
				storage.push(s.pop());
		}
	}

	public Customer[] ListCustomers() {
		// Customer
		Customer[] C = new Customer[persons.length];
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getClass() == Customer.class) {
				C[i] = (Customer) persons[i];
			}
		}
		return C;
	}

	public Seller[] ListSellers() {
		// Seller
		Seller[] S = new Seller[persons.length];
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getClass() == Seller.class) {
				S[i] = (Seller) persons[i];
			}
		}
		return S;
	}

	public CargoWorker[] ListCargoWorkers() {
		// Seller
		CargoWorker[] S = new CargoWorker[persons.length];
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getClass() == CargoWorker.class) {
				S[i] = (CargoWorker) persons[i];
			}
		}
		return S;
	}

	public Product[] ListAllProducts() {

		Product[] S = new Product[persons.length];
		Node temp = products.getHead();
		int index = 0;
		while (temp != null) {
			S[index] = (Product) temp.getO();
			index++;
			temp = temp.getLink();
		}
		return S;
	}

	public Product[] ListAllProducts(Stack s) {
		int size = s.size();
		Product[] S = new Product[size];
		Stack temp = new Stack(size);
		int index = 0;
		for (int i = 0; i < size; i++) {
			S[index] = (Product) s.peek();
			index++;
			temp.push(s.pop());
		}

		for (int i = 0; i < size; i++) {
			s.push(temp.pop());
		}
		return S;
	}

	public int Search(int selection, String Name) {
		Node temp;
		boolean flag = true;
		int index = -1;
		switch (selection) {

		case 1:
			// CargoWorker
			DEC.SearchWorker(Name);
			break;
		case 2:
			// Customer
			for (int i = 0; i < persons.length; i++) {

				if (persons[i] != null && persons[i].getClass() == Customer.class && persons[i].getName() == Name) {
					index = i;
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		case 3:
			// Seller
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] != null && persons[i].getClass() == Seller.class && persons[i].getName() == Name) {
					index = i;
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		case 4:
			flag = false;
			index = -1;
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] != null && persons[i].getClass() == CargoWorker.class && persons[i].getName() == Name) {
					index = i;
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("NOT FOUND");
			break;
		case 5:
			// Man_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				Man_Product m = (Man_Product) temp.getO();
				String id = m.getProduct_Name();
				if (temp.getO().getClass() == Man_Product.class && id == Name) {
					System.out.println(m.toString());
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		case 6:
			// Women_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				Women_Product m = (Women_Product) temp.getO();
				String id = m.getProduct_Name();
				if (temp.getO().getClass() == Women_Product.class && id == Name) {
					System.out.println(m.toString());
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		case 7:
			// Child_Product
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				Child_Product m = (Child_Product) temp.getO();
				String id = m.getProduct_Name();
				if (temp.getO().getClass() == Child_Product.class && id == Name) {
					System.out.println(m.toString());
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		case 8:
			break;
		// All Search
		case 9:
			temp = products.getHead();
			if (temp == null)
				System.out.println("List is empty.");
			while (temp != null) {
				Product m = (Product) temp.getO();
				String name = m.getProduct_Name();
				if (name == Name) {
					System.out.println(m.toString());
					flag = false;
					break;
				}
				temp = temp.getLink();
			}
			if (!flag) {
				System.out.println("NOT FOUND.");
			}
			break;
		}
		return index;
	}

	public Product SearchProduct(Product P) {
		Product result = null;
		Node temp = products.getHead();
		if (temp == null)
			System.out.println("List is empty.");
		while (temp != null) {
			Product m = (Product) temp.getO();
			String name = m.getProduct_Name();
			if (name == P.getProduct_Name()) {
				result = (Product) temp.getO();

				break;
			}
			temp = temp.getLink();
		}
		return result;
	}

	public Product SearchProductInStack(Stack s, Product P) {
		int size = s.size();
		Product S = null;
		boolean flag;
		Stack temp = new Stack(size);
		while (!s.isEmpty()) {
			Product p = (Product) s.peek();
			int m = p.getID();
			if (P.getID() == m) {
				S = (Product) s.pop();
				flag = true;
			}
			temp.push(s.pop());
		}
		
		while(!temp.isEmpty()) {
			s.push(temp.pop());
		}

		return S;
	}

	public String[] toArrayPacket(Stack s) {
		int size = s.size();
		String[] arr = new String[size];
		Stack temp = new Stack(size);

		for (int i = 0; i < size; i++) {
			Packet P = (Packet) s.peek();
			arr[i] = P.toString();
			temp.push(s.pop());
		}

		for (int i = 0; i < size; i++) {
			s.push(temp.pop());
		}

		return arr;
	}

	public String[] toArrayProduct(Stack s) {
		int size = s.size();
		String[] arr = new String[size];
		Stack temp = new Stack(size);

		for (int i = 0; i < size; i++) {
			Product P = (Product) s.peek();
			arr[i] = P.toString();
			temp.push(s.pop());
		}

		for (int i = 0; i < size; i++) {
			s.push(temp.pop());
		}

		return arr;
	}

	public String[] toArray(Queue q) {
		int size = q.size();
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			Packet P = (Packet) q.peek();
			arr[i] = P.toString();
			q.enqueue(q.dequeue());
		}
		return arr;
	}

	public void addPerson(Person P) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = P;
				break;
			}
		}
	}

}
