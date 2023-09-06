package com.shreyans.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;


@WebServlet("/TestDbService")
public class TestDbService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//setup connection variables
		String user="springstudent";
		String pass="springstudent";
		
		String  jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
	    String driver="com.mysql.jdbc.Driver";
	
	//get connection
	    try {
	    	//When you are using JDBC outside of an application server, 
	    	//the DriverManager class manages the establishment of connections.
	    	
	    	
	    	PrintWriter out= response.getWriter();
	    	out.println("Connecting to Database:-"+driver);
	    	
	    	
	    	Class.forName(driver);
	    	
	    	
	    	Connection conn= DriverManager.getConnection(jdbcUrl, user, pass);
	    	out.println("Connection sucessful");
	    	
	    	conn.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    	throw new ServletException(e);
	    }
	
	}

}
