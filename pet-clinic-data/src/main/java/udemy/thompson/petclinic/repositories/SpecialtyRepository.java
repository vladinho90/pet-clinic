package udemy.thompson.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.thompson.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
