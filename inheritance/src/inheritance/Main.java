package inheritance;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Customer customer = new Customer();
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.add();
		employeeManager.remove();
		employeeManager.monthMan();
	}
}
