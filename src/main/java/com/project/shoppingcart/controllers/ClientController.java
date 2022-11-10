package com.project.shoppingcart.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoppingcart.dtos.ClientDto;
import com.project.shoppingcart.models.Client;
import com.project.shoppingcart.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientService clientService;

	// posts clients
	@PostMapping
	public ResponseEntity<Object> saveClient(@RequestBody ClientDto clientdto){
		var client = new Client();
		BeanUtils.copyProperties(clientdto, client);
		return ResponseEntity.created(null).body(clientService.save(client));
	}

	//gets all clients
	@GetMapping
	public ResponseEntity<List<Client>> getAllClients(){
		List<Client> list = clientService.findsAllClients();
		return ResponseEntity.ok().body(list); 
	}
	
}
