
public class Date {
	private int day;
	private int month;
	private int year;

	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		}
	
	public void controllingDate(int day, int month, int year) { // controlling invalid date
		if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			System.out.println("invalid date");
		}
		else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			System.out.println("invalid date");
		}
		else if (month == 2 && day > 28) {
			System.out.println("invalid date");
		}
		else if(day < 1 || year < 1 || month < 1) {
			System.out.println("invalid date");
		}
		else if (month > 12) {
			System.out.println("invalid date");
		}
	}
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}

	public void setDay(int day) {this.day = day;}
	public void setMonth(int month) {this.month = month;}
	public void setYear(int year) {this.year = year;}
	
	public void display() {
		System.out.print(this.day + "/" + this.month + "/" + this.year + " ");
	}
}
