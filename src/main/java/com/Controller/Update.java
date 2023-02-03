package com.Controller;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dto.Customer;

public class Update {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the id ");
		customer.setId(scanner.nextInt());
		
		System.out.println("enter the name ");
		customer.setName(scanner.next());
		
	    System.out.println("enter the address ");
	    customer.setAddress(scanner.next());
	    
	    
	    CustomerDao customerDao = new CustomerDao();
	    customerDao.update_dao(customer);
	    System.out.println("data updated successfully....!!");
	}

}
