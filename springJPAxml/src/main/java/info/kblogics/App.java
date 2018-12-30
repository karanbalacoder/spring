package info.kblogics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
    employeeDAO.operations();
    
    }
    
}
