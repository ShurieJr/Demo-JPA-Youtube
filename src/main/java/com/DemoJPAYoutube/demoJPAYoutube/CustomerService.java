package com.DemoJPAYoutube.demoJPAYoutube;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    //operations
    public void addCustomer(Customer customer) {
        repository.save(customer);
    }
    //update
    public void updateCustomer(Customer customer) {
        repository.save(customer);
    }

    //delete
    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }

    //get all customers
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    //get customer by id
    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }
}
