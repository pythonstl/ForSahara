package Week_2_Wednesday;

public class Employee extends Person {
	// constructors:
	public Employee() 
	{}
	
	public Employee(String firstName, String lastName, double subtotal) {
		super(firstName, lastName,subtotal);
	}
	
	// methods:
	public double taxes(double amount) {
		return amount * 0.2;
	}
}
