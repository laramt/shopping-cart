package com.project.shoppingcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoppingcart.models.Restaurant;
import com.project.shoppingcart.repositories.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	// saves on repository
	public Restaurant save(Restaurant restaurant) {

		return restaurantRepository.save(restaurant);
	}
	
	// finds all restaurants
	public List<Restaurant> findsAllRestaurants(){
		return restaurantRepository.findAll();
	}
}
