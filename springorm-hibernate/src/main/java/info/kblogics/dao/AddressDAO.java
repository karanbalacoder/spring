package info.kblogics.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import info.kblogics.entity.Address;


@Repository
public class AddressDAO {
	

@Autowired
private HibernateTemplate hibernateTemplate;
	

	
	public void save(Address address) {
		hibernateTemplate.save(address);
	}

}
