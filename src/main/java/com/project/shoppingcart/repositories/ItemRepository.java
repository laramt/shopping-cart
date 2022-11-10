package com.project.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shoppingcart.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
