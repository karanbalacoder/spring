package info.kblogics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void operations() {
		
		entityManager.persist(new Employee(1,"raja",1000d));
	}

}
