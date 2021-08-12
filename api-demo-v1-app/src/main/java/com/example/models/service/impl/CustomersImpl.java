package com.example.models.service.impl;

import com.example.models.dao.CustomersDao;
import com.example.models.entity.Customers;
import com.example.models.service.ICustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersImpl implements ICustomers {

    @Autowired
    CustomersDao customersDao;

    @Override
    public List<Customers> getAll() {
        return customersDao.findAll();
    }

    @Override
    public Optional<Customers> getById(Long id) {
        return customersDao.findById(id);
    }

    @Override
    public Customers save(Customers customers) {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(Long id) {

    }
}
