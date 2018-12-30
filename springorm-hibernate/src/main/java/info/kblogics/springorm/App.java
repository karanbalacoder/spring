package info.kblogics.springorm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import info.kblogics.controller.EmployeeController;
import info.kblogics.entity.Address;
import info.kblogics.entity.Employee;
import info.kblogics.util.DataSourceFactory;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(DataSourceFactory.class);

		Employee employee = new Employee();
		employee.setEno(12);
		employee.setName("karan");
		employee.setSalary(3400d);

		Address address = new Address();
		address.setAid(173);
		address.setCity("hyd");
		address.setState("ts");

		EmployeeController employeeController = container.getBean(EmployeeController.class);
		employeeController.saveEmployee(employee, address);
		container.close();
	}
}
