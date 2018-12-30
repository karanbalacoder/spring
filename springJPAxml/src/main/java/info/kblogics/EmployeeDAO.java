package info.kblogics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class EmployeeDAO {

	
	private EntityManagerFactory entityManagerFactory;
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}



	public  void operations() {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
Employee employee = entityManager.find(Employee.class, 81);
System.out.println(employee);
	}

}
