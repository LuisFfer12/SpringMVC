package com.luis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luis.dao.CustomerDAO;
import com.luis.entity.Customer;
import com.luis.services.CustomerService;
import com.luis.services.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject the CustomerDAO
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String lisCustomers(Model theModel) {
		
		List<Customer> customers = customerService.getCustomers();
		
		
		//O parametro em "" serve para a pagina view jsp
		theModel.addAttribute("customers", customers);
		
		return "customer-list";
	}
	
	@RequestMapping("/addCustomerForm")
	public String showAddForm(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String processForm(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel ) {
		
		Customer theCustomer = customerService.getCustomers(theId);
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int theId, Model theModel ) {
		
		customerService.delete(theId);
		
		return "redirect:/customer/list";
	}

}






