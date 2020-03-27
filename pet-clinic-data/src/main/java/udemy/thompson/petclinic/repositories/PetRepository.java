package udemy.thompson.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.thompson.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
