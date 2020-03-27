package udemy.thompson.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.thompson.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
