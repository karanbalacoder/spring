package info.kblogics.springorm;

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
        AnnotationConfigApplicationContext contaier = new AnnotationConfigApplicationContext(DataSourceUtil.class);
        EmployeeDAO employeeDAO = contaier.getBean(EmployeeDAO.class);
        employeeDAO.operationEMP();
    }
}
