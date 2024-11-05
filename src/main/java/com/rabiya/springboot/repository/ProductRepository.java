package com.rabiya.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabiya.springboot.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
