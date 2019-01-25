package Week_2_Wednesday;

public class Student extends Person {
	// constructors:
	public Student() 
	{}
	
	public Student(String firstName, String lastName, double subtotal) {
		super(firstName,lastName,subtotal);
	}
	
	// methods:
	public double taxes(double amount) {
		return amount * 0.02;
	}
}
