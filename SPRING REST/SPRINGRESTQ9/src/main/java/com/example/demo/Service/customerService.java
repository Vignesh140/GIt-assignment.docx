package com.example.demo.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class customerService {

	@Autowired
	//injecting instance of TopicRepository.
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers(){
//		
		List<Customer> customers = new ArrayList<>();
		customerRepo.findAll()
		.forEach(customers::add);
		return customers;
	}
	
	public Optional<Customer> getCustomer(int id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return customerRepo.findById(id);
	
	}
	
	public void addCustomer(Customer customer) {
//		topics.add(topic);
		customerRepo.save(customer);
		
	}
	
	public void updateCustomer(int id, Customer customer) {
//		for(int i =0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		//save can do both add and update.
		customerRepo.save(customer); 
		
	}

	public void deleteCustomer(int id) {
//		topics.removeIf(t -> t.getId().equals(id));
		customerRepo.deleteById(id);
	}
}
