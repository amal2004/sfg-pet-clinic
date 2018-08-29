package amal.springframework.sfgpetclinic.services;

import amal.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
