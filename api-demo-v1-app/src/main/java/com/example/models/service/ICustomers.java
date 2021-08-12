package com.example.models.service;

import com.example.models.entity.Customers;

import java.util.List;
import java.util.Optional;

public interface ICustomers {

    public List<Customers> getAll();

    public Optional<Customers> getById(Long id);

    public Customers save(Customers customers);

    public void update();

    public void delete(Long id);
}
