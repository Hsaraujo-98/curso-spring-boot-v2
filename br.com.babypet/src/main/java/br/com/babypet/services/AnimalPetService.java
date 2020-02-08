package br.com.babypet.services;

import org.springframework.stereotype.Service;

import br.com.babypet.domain.AnimalPet;
import br.com.babypet.dtos.commands.AnimalPetInsertCommand;
import br.com.babypet.repositories.AnimalPetRepository;

@Service
public class AnimalPetService {

	private AnimalPetRepository animalPetRepository;

//	public AnimalPet incluir(AnimalPetInsertCommand command) {
//		AnimalPet animalPet = AnimalPet.criar(command);
//		return animalPetRepository.save(animalPet);
//	}

}
