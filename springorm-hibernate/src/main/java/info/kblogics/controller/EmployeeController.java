package info.kblogics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import info.kblogics.entity.Address;
import info.kblogics.entity.Employee;
import info.kblogics.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void saveEmployee(Employee employee, Address address) {

		employeeService.save(employee, address);
	}

}
