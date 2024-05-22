package com.DemoJPAYoutube.demoJPAYoutube;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    //requests
    //get all customers
    @GetMapping("/all")
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }

    //get customer by id
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
    }
    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        customer.setId(id);
        service.updateCustomer(customer);
    }
}
