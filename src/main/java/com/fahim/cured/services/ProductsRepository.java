package com.fahim.cured.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahim.cured.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
