package com.devsuperior.dsapostas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsapostas.dto.PlayersDTO;
import com.devsuperior.dsapostas.entities.Players;
import com.devsuperior.dsapostas.repositories.PlayersRepository;
import com.devsuperior.dsapostas.services.exception.ObjectNotFoundException;

@Service
public class PlayersService {
	
	@Autowired
	private PlayersRepository repository;
	
	@Transactional
	public PlayersDTO insert(PlayersDTO dto) {
		Players entity = new Players();
		entity.setName(dto.getName());	// Não entendi aqui!
		entity = repository.save(entity);
		return new PlayersDTO(entity);
	}
	
	public Players find(Long id) {
		Optional<Players> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Players.class.getName()));
	}
}
