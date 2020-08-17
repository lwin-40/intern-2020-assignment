
abstract class Employee {

	public abstract void getName();

	public void showDepartment() {
		System.out.println("Accounting");
	}
}

class Employee1 extends Employee {
	public void getName() {

		System.out.println("Aung Aung");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Employee1 employee1=new Employee1();
		employee1.getName();
		employee1.showDepartment();
		
	}
}
