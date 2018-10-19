package com.aravindan.petclinic.services.map;

import com.aravindan.petclinic.model.Owner;
import com.aravindan.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	

}
