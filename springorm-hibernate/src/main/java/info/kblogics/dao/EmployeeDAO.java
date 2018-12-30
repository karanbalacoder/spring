package info.kblogics.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import info.kblogics.entity.Employee;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	public void save(Employee employee) {
		hibernateTemplate.save(employee);
	}

	
}
