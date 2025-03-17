package info.kblogics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.kblogics.entity.Employee;
import info.kblogics.service.EmployeeService;

@Controller
@RequestMapping(path = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String loginForm(Model model) {
		System.out.println("hello bikarno");
		model.addAttribute("employee", new Employee());
		return "login";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String displayResult(@Validated Employee employee, Errors errors) {
		

		if (errors.hasErrors()) {
			return "login";
		} else {
			employeeService.insertEmployee(employee);
			return "result";
		}
	}
}
