package info.kblogics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.kblogics.dao.EmployeeDAO;
import info.kblogics.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void insertEmployee(Employee employee) {
		employeeDAO.insertEmployee(employee);
		
	}

}
