package info.kblogics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.kblogics.dao.EmployeeDAO;
import info.kblogics.entity.Employee;

@Controller
@RequestMapping(path="/search")
public class EmpSearchController {

	@Autowired
	private EmployeeDAO employeeDAO;
	@RequestMapping(method=RequestMethod.GET)
	public String searchForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "search";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String searchResult(Integer eno,Model model ) {
		List<Employee> list = employeeDAO.searchEmp(eno);
		
		model.addAttribute("list", list);
		return "details";
	}
}
