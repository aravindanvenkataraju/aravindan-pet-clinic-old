package com.aravindan.petclinic.services.map;

import com.aravindan.petclinic.model.Vet;
import com.aravindan.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	

}
