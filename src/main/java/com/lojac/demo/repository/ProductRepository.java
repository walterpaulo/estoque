package com.lojac.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojac.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
