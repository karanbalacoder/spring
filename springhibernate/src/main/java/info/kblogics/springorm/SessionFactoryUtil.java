package info.kblogics.springorm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataSource;

import org.hibernate.mapping.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class SessionFactoryUtil {

	@Autowired
	private javax.sql.DataSource dataSource;

	@Bean
	public LocalSessionFactoryBean factoryBean() throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/hibernate.properties"));
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setAnnotatedClasses(Employee.class);
		factoryBean.setHibernateProperties(properties);
		return factoryBean;
	}

}
