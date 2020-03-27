package udemy.thompson.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.thompson.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
