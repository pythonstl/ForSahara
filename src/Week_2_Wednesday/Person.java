package Week_2_Wednesday;

public abstract class Person {
	// fields:
	protected String firstName, lastName;
	protected double subtotal;
	
	// constructors:
	protected Person() 
	{}
	
	protected Person(String firstName, String lastName, double subtotal) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subtotal = subtotal;
	}
	
	// properties:
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubstotal(double subtotal) {
		this.subtotal = subtotal;
	}
		
	// methods:
	public abstract double taxes(double amount);
	
	public double calcTelBill(double amount) {
		return this.taxes(amount) + amount;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
