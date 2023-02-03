package com.Controller;

import com.Dao.CustomerDao;
import com.Dto.Customer;

public class Delete_all {
	public static void main(String[] args) {
		Customer customer = new Customer();
		CustomerDao customerDao = new CustomerDao();
		customerDao.delete_all(customer);
	}

}
