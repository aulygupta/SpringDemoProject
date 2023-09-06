package com.shreyans.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shreyans.springdemo.dao.CustomerDAO;
import com.shreyans.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	//need to inject customerDAO
	@Autowired
	CustomerDAO customerDao;
	
	@Override
	@Transactional       //this will define the start and end of a transaction   
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

}
