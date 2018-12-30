package info.kblogics;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/ec")
public class EmployeeController {
	
	@RequestMapping
	public String doWork(Model model) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("anil");
		arrayList.add("bharath");
		arrayList.add("chandu");
	model.addAttribute("details", arrayList);
		
		return "one.jsp";
	}

}
