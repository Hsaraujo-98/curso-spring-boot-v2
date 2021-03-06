package br.com.babypet.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.babypet.dtos.commands.AnimalPetInsertCommand;
import lombok.Getter;

@Document(collation = "animal_pet")
@Getter
public class AnimalPet {

	@Id
	private String id;
	private String nome;
	private String especie;

	protected AnimalPet() {
	}

	private AnimalPet(AnimalPetInsertCommand command) {
		this.nome = command.getNome();
		this.especie = command.getEspecie();

	}

	public static AnimalPet criar(AnimalPetInsertCommand command) {
		command.validate();
		return new AnimalPet(command);

	}

}
