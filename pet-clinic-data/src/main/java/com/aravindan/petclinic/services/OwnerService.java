package com.aravindan.petclinic.services;

import java.util.Set;

import com.aravindan.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);

}
