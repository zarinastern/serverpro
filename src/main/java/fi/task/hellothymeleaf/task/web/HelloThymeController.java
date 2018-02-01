package fi.task.hellothymeleaf.task.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class HelloThymeController {
	
	@RequestMapping("/hello")
	public String hello( Model model) { String myName = "Monkey"; 
	model.addAttribute("name", myName);
		return "hello";
	}

}
