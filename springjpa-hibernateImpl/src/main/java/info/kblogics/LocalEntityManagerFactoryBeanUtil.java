package info.kblogics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.instrument.classloading.SimpleLoadTimeWeaver;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class LocalEntityManagerFactoryBeanUtil {

	@Autowired
	private DataSource dataSource;
	

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setPackagesToScan("info.kblogics");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factoryBean.setLoadTimeWeaver(new SimpleLoadTimeWeaver());
		factoryBean.setJpaProperties(properties);
		return factoryBean;
		
	}

}
