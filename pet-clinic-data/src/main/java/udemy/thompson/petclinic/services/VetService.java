package udemy.thompson.petclinic.services;

import udemy.thompson.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findALL();
}
