public abstract class Person {
	private String name;
	private String surname;
	private String mail;
	private Phone phone_number;
	private String gender;
	private Adress address;
	private Date date;
	private int id;
	private static int unique_ID = 0;

	public Person(String name, String surname, String mail, Phone phone_number, String gender, Adress address,
			Date date) {
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.phone_number = phone_number;
		this.gender = gender;
		this.address = address;
		this.date = date;

		id = unique_ID;
		unique_ID++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Phone getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Phone phone_number) {
		this.phone_number = phone_number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", id=" + id + ", mail=" + mail + ", phone_number="
				+ phone_number + ", gender=" + gender + ", address=" + address + ", date=" + date + "]";
	}

}
