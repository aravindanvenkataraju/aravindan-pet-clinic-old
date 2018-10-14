package com.aravindan.petclinic.services;

import java.util.Set;

import com.aravindan.petclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet findByLastName(String lastName);
	Vet save(Vet owner);
	Set<Vet> findAll();

}
