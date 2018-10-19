package com.aravindan.petclinic.services.map;

import com.aravindan.petclinic.model.Pet;
import com.aravindan.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	

}
