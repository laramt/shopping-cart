package com.project.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.shoppingcart.models.Client;

 @Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
