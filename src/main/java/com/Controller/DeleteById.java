package com.Controller;

import java.util.Scanner;

import com.Dao.CustomerDao;
import com.Dto.Customer;

public class DeleteById {
	public static void main(String[] args) {
		Customer customer = new Customer();//dto
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id ");
		int x = scanner.nextInt();
		
		CustomerDao customerDao = new CustomerDao();//dao
		customerDao.delete_by_id(customer, x);
	}

}
