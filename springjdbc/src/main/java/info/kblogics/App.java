package info.kblogics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(EmployeeDAO.class);
        EmployeeDAO employeeDAO = container.getBean(EmployeeDAO.class);
    
     employeeDAO.insertEmployee();
}}
