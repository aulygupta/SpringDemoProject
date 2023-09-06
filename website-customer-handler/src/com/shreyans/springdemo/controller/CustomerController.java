package com.shreyans.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shreyans.springdemo.dao.CustomerDAO;
import com.shreyans.springdemo.entity.Customer;
import com.shreyans.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	/*
	 * //inject CustomerDAO
	 * 
	 * @Autowired private CustomerDAO customerDAO;
	 */
	
	//inject service layer
	@Autowired
	private CustomerService customerService;
	
	

	@GetMapping("/list")
	public String customerList(Model model) {
		
		//get customer form customerDAO
		List<Customer> theCustomers=customerService.getCustomers();
		
		//add customer to model
		model.addAttribute("customers",theCustomers);
		
		return "customerList";
	} 
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model)
	{
		Customer newCustomer= new Customer();
		
		model.addAttribute("newCustomer", newCustomer);
		
		return "addCustomer";
	}
	@GetMapping("/addNewCustomer")
	public String addNewCustomer(@ModelAttribute("newCustomer")Customer obtCustomer)
	{
		
		System.out.println(obtCustomer.getEmail());
	
		//store this customer
		//get the new list of customer
		
		
		return "customerList";
	}
	
	
}
