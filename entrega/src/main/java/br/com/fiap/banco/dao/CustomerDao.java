package br.com.fiap.banco.dao;

import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT ID, NAME FROM CUSTOMERS";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                customers.add(new Customer(rs.getInt("ID"), rs.getString("NAME")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return customers;
    }
}