package udemy.thompson.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.thompson.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
