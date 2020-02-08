package br.com.babypet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.babypet.domain.AnimalPet;

public interface AnimalPetRepository extends MongoRepository<AnimalPet, String> {

}
