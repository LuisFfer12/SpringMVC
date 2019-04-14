package com.teste;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWordForm {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsCaps(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Jhow!" + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsCapsThree(@RequestParam("studentName") String theName, Model model) {
			
		theName = theName.toUpperCase();
		
		String result = "Jhow v3! " + theName;
		
		model.addAttribute("message", result);
	
		return "helloworld";
	}
	
	
}
