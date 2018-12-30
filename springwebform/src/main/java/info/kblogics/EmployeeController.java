package info.kblogics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class EmployeeController {

	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public String display() {

		return "display";
	}

	@RequestMapping( value="/emp", method = RequestMethod.POST)
	public String successPage( Model model, Employee employee, BindingResult result) {
		System.out.println(result);
		if (result.hasErrors()) {
			return "display";
		} else {
			return "success";
		}
	}

}
