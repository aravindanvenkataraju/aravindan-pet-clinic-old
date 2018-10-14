package com.aravindan.petclinic.services;

import java.util.Set;

import com.aravindan.petclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	Pet save(Pet owner);
	Set<Pet> findAll();

}
