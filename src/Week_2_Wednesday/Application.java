package Week_2_Wednesday;

public class Application {
	public static void main(String[] args) {
		Student s1 = new Student("Anthony", "Sulezich-Kalogjera", 60);
		Employee e1 = new Employee("Swetal", "Patel", 60);
		
		//double s1Total = s1.calcTelBill(60);
		//System.out.println(s1Total);
		
		//double e1Total = e1.calcTelBill(60);
		//System.out.println(e1Total);
		
		Person p1 = new Student("Mahendra", "Patel", 100);
		Person p2 = new Employee("Renuka", "Patel", 100);
		
		//double p1Total = p1.calcTelBill(75);
		//double p2Total = p2.calcTelBill(75);
		//System.out.println(p1Total);
		//System.out.println(p2Total);
		
		Person[] persons = {s1,  e1, p1, p2};
		for (Person person : persons) {
			System.out.println(person.getFirstName() + " " + person.getLastName() + ": " + person.calcTelBill(person.getSubtotal()));
		}
	}
}
