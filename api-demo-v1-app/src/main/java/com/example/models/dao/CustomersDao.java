package com.example.models.dao;

import com.example.models.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersDao extends JpaRepository<Customers,Long> {
}
