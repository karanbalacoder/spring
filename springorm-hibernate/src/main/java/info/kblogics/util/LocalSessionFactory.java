package info.kblogics.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import info.kblogics.entity.Address;
import info.kblogics.entity.Employee;

@Configuration
public class LocalSessionFactory {

	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalSessionFactoryBean createLocal() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto"	, "update");
		
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setAnnotatedClasses(Employee.class,Address.class);
sessionFactory.setHibernateProperties(properties);
		return sessionFactory;

	}

	
}
