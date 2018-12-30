package info.kblogics.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.kblogics.dao.AddressDAO;
import info.kblogics.dao.EmployeeDAO;
import info.kblogics.entity.Address;
import info.kblogics.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Autowired
	private AddressDAO addressDAO;

	@Transactional
	public void save(Employee employee, Address address) {
		addressDAO.save(address);
		employeeDAO.save(employee);
		
	}

}
