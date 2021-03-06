package com.mindtree.JSH.dao;

import java.util.List;

import com.mindtree.JSH.entity.model.Customer;


 
public interface CustomerDAO {
 
    public String insertNewCustomer(Customer customer);
    public Customer getCustomer(int customerId);
    public String updateCustomer(Customer customer);
    public String deleteCustomer(Customer customer);
    public List<Customer> getAllCustomer();
}