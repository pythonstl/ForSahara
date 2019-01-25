package Week_2_Tuesday;

public class Date {
	// fields:
	private int month, day, year;
	
	// constructors
	public Date() {}
	
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// properties:
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// methods:
	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
