
public class Packet {
	private int id;
	private static int unique_ID;
	private Customer receiver;
	private Seller sender;
	private Date sentDate;
	private Date receiveDate;
	private double payment;
	private String status;
	private CargoWorker employee;

	public Packet(Customer receiver, Seller sender, Date sentDate, Date receiveDate, double payment,
			CargoWorker employee) {
		id = unique_ID;
		this.receiver = receiver;
		this.sender = sender;
		this.sentDate = sentDate;
		this.receiveDate = receiveDate;
		this.payment = payment;
		this.status = "Created";
		this.employee = employee;
		unique_ID++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getUnique_ID() {
		return unique_ID;
	}

	public static void setUnique_ID(int unique_ID) {
		Packet.unique_ID = unique_ID;
	}

	public Customer getReceiver() {
		return receiver;
	}

	public void setReceiver(Customer receiver) {
		this.receiver = receiver;
	}

	public Seller getSender() {
		return sender;
	}

	public void setSender(Seller sender) {
		this.sender = sender;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CargoWorker getEmployee() {
		return employee;
	}

	public void setEmployee(CargoWorker employee) {
		this.employee = employee;
	}

	public String toString() {
		return "Packet [id=" + id + ", receiver=" + receiver.getName() + ", sender=" + sender.getName() + ", status=" + status+ "]";
	}

	public void receiveFromCargo() {
		employee.deleteDistribution_order(id);
		setStatus("Received");
	}

}
