package info.kblogics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class EmployeeController {
	
	@RequestMapping(path="/emp",method=RequestMethod.GET)
	public String display() {
		
		return "display.jsp";
	}
	
	@RequestMapping(path="/emp",method=RequestMethod.POST)
	public String successPage(Employee employee,Model model) {
		model.addAttribute(employee);
		System.out.println( employee.getEno());
		System.out.println( employee.getName());
		System.out.println( employee.getSalary());
		return "success.jsp";
	}
	

}
