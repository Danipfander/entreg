package br.com.fiap.banco.resource;

import br.com.fiap.banco.model.Customer;
import br.com.fiap.banco.service.CustomerService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

// Caminho do recurso
public class CustomerResource {

    private final CustomerService customerService;

    public CustomerResource() {
        this.customerService = new CustomerService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}