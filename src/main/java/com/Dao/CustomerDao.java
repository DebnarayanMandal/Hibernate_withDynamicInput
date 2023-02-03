package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Dto.Customer;

public class CustomerDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Debnarayan");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public Customer insert_dao(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	public Customer update_dao(Customer customer) {
		
		entityTransaction.begin();
		entityManager.merge(customer);
		entityTransaction.commit();
		
		return customer;
		
	}
	public void get_all(Customer customer) {
		Query query = entityManager.createQuery("select s from customerdelails s");
		
		List<Customer>l1 = query.getResultList();
		for(Customer l2 : l1) {
			System.out.println("--------------------------");
			System.out.println(l2.getId());
			System.out.println(l2.getName());
			System.out.println(l2.getAddress());
			System.out.println("-------------------------");
		}
		//return customer;
	}
	public Customer get_by_id(Customer customer, int x) {
		
		customer = entityManager.find(Customer.class,x);
		
		if(customer!=null) {
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getAddress());
			System.out.println("-----------------");
		}else {
			System.out.println("data not in table");
		}
		
		return customer;
		
	}
	public Customer delete_by_id(Customer customer, int x) {
		
		customer = entityManager.find(Customer.class,x);
		
		entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
		System.out.println("date is deleted");
		
		return customer;
		
	}
	public Customer delete_all(Customer customer) {
		
		entityTransaction.begin();
		Query query = entityManager.createQuery("delete from customerdelails ");
		query.executeUpdate();
		entityTransaction.commit();
		
		System.out.println("data all deleted");
		return customer;
		
	}

}
