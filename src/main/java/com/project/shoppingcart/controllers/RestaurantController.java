package com.project.shoppingcart.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoppingcart.dtos.RestaurantDto;
import com.project.shoppingcart.models.Restaurant;
import com.project.shoppingcart.services.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	// posts restaurants
		@PostMapping
		public ResponseEntity<Object> saveRestaurant(@RequestBody RestaurantDto restaurantDto){
			var restaurant = new Restaurant();
			BeanUtils.copyProperties(restaurantDto, restaurant);
			return ResponseEntity.created(null).body(restaurantService.save(restaurant));
		}

		//gets all clients
		@GetMapping
		public ResponseEntity<List<Restaurant>> getAllRestaurants(){
			List<Restaurant> list = restaurantService.findsAllRestaurants();
			return ResponseEntity.ok().body(list); 
		}
}
