package com.aravindan.petclinic.services;

import com.aravindan.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
	Vet findByLastName(String lastName);
}
