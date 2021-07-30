
public class CargoWorker extends Person {
	private Queue distribution_order;
	int currentPacketCount;
	private double monthyly_salary;
	private int succesfull_orders;
	private int unsuccesfull_orders;

	public CargoWorker(String name, String surname, String mail, Phone phone_number, String gender, Adress address,
			Date date, int monthyly_salary) {
		super(name, surname, mail, phone_number, gender, address, date);
		this.monthyly_salary = monthyly_salary;
		this.succesfull_orders = 0;
		this.unsuccesfull_orders = 0;
		currentPacketCount=0;
		distribution_order = new Queue(15000);
	}

	
	
	public Queue getDistribution_order() {
		return distribution_order;
	}



	public void setDistribution_order(Queue distribution_order) {
		this.distribution_order = distribution_order;
	}



	public double getMonthyly_salary() {
		return monthyly_salary;
	}

	public void setMonthyly_salary(double increasedSalary) {
		this.monthyly_salary = increasedSalary;
	}

	public int getSuccesfull_orders() {
		return succesfull_orders;
	}

	public void setSuccesfull_orders(int succesfull_orders) {
		this.succesfull_orders = succesfull_orders;
	}

	public int getUnsuccesfull_orders() {
		return unsuccesfull_orders;
	}

	public void setUnsuccesfull_orders(int unsuccesfull_orders) {
		this.unsuccesfull_orders = unsuccesfull_orders;
	}

	
	public int getCurrentPacketCount() {
		return currentPacketCount;
	}

	public void setCurrentPacketCount(int currentPacketCount) {
		this.currentPacketCount = currentPacketCount;
	}

	public boolean addDistribution_order(Packet P) {
		boolean flag=false;
		if(currentPacketCount<10) {
			   flag=true;
				distribution_order.enqueue(P);				
		}	
		return flag;
		
			
		
	}

	public int deleteDistribution_order(int id) {
		int size = distribution_order.size();
		for (int i = 0; i < size; i++) {
			if ((int) distribution_order.peek() == id) {
				distribution_order.dequeue();
				distribution_order.enqueue(distribution_order.dequeue());
				succesfull_orders++;
			} else
				distribution_order.enqueue(distribution_order.dequeue());
		}
		return id;
	}
	public String toString() {
		return "Cargo Worker [Name=" + getName() + ", Surname=" + getSurname() + ", ID=" + getId() + "]";
	}
}
