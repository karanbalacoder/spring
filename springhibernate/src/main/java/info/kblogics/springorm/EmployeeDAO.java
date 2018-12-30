package info.kblogics.springorm;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

@Configuration
@Transactional
public class EmployeeDAO extends HibernateDaoSupport {
	
	@Autowired
public EmployeeDAO(HibernateTemplate hibernateTemplate) {
	this.setHibernateTemplate(hibernateTemplate);
}

public void operationEMP() {
	
	 this.getHibernateTemplate().save("info.kblogics.springorm.Employee", new Employee(61,"shiva",2000d));
	
}}
