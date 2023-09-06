package com.shreyans.springdemo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shreyans.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject the session factory
	@Autowired
	SessionFactory sessionFactory;
	
	//get list of customer
	@Override
	public List<Customer> getCustomers() {
	
		//get current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		
		//create query
		Query<Customer> theQuery=currentSession.
				createQuery("from Customer", Customer.class);
		
		
		//execute query and get list
		  List<Customer> listOfCustomers=theQuery.getResultList();
		    
	
	
		//return list of customers 
		   return listOfCustomers;
			
	
	}
	//save new customer

}
