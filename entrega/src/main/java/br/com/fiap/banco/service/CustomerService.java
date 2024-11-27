package br.com.fiap.banco.service;

import br.com.fiap.banco.dao.CustomerDao;
import br.com.fiap.banco.model.Customer;

import java.util.List;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService() {
        this.customerDao = new CustomerDao();
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }
}