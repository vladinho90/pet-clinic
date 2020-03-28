package udemy.thompson.petclinic.services;

import udemy.thompson.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
