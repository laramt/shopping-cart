package com.project.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shoppingcart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
