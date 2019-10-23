package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "Thanh", "Thanh@gmail.com", "Ha Noi"));
        customerMap.put(2, new Customer(2, "chinh", "chinhcomhut@gmail.com", "Hai Duong"));
        customerMap.put(3, new Customer(3, "Linh", "linh@yahoo.com", "Ha Noi"));
        customerMap.put(4, new Customer(4, "Hieu", "Hieu@codegym.com", "Ho Tay"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
