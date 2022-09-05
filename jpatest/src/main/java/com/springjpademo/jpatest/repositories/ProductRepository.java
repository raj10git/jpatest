package com.springjpademo.jpatest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpademo.jpatest.entities.Product;

import java.util.Optional;
 
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}