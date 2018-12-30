package info.kblogics.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="info.kblogics")
@EnableWebMvc
@EnableTransactionManagement
public class EnableAnnotations {

}
