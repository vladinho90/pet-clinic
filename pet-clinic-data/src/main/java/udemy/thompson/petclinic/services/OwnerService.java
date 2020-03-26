package udemy.thompson.petclinic.services;

import udemy.thompson.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);
}
