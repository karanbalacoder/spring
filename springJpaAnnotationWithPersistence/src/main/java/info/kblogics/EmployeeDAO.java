package info.kblogics;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@Transactional
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void operations() {
		entityManager.persist(new Employee(71, "work", 10005d));
	}

}
