package com.devsuperior.dsapostas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsapostas.dto.PlayersDTO;
import com.devsuperior.dsapostas.entities.Players;
import com.devsuperior.dsapostas.repositories.PlayersRepository;

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

}
