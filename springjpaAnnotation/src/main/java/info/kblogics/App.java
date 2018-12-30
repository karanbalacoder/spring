package info.kblogics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(DataSourceUtil.class);
    EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
    employeeDAO.operations();
    }
}
