package com.Controller;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dto.Customer;

public class Insert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Customer custome = new Customer();
		
		
		System.out.println("enter the name ");
		custome.setName(scanner.next());
		
		System.out.println("enter the address ");
		custome.setAddress(scanner.next());
		
		CustomerDao  customerDao = new CustomerDao();
		customerDao.insert_dao(custome);
		
		if(custome!=null) {
		System.out.println("data is added successfully!!");
	}else {
		System.out.println("data is not added");
	}
	
	}	

}
