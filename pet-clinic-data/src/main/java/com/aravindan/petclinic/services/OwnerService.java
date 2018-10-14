package com.aravindan.petclinic.services;

import java.util.Set;

import com.aravindan.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	Owner findByLastName(String lastName);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
