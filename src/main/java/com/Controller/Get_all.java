package com.Controller;

import com.Dao.CustomerDao;
import com.Dto.Customer;

public class Get_all {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		CustomerDao customerDao = new CustomerDao();
		customerDao.get_all(customer);
	}

}
