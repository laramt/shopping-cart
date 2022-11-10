package com.project.shoppingcart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoppingcart.models.Client;
import com.project.shoppingcart.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	// saves on repository
	public Client save(Client client) {

		return clientRepository.save(client);
	}
	
	// finds all clients
	public List<Client> findsAllClients(){
		return clientRepository.findAll();
	}

}
