package com.aravindan.petclinic.services;

import java.util.Set;

import com.aravindan.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
	Vet findByLastName(String lastName);
}
