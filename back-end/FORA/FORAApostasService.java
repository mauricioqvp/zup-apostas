package com.devsuperior.dsapostas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsapostas.entities.Apostas;
import com.devsuperior.dsapostas.repositories.ApostasRepository;

@Service
public class ApostasService {

	@Autowired
	private ApostasRepository repository;
	
	/*
	 * @Transactional public ApostasDTO insert(ApostasDTO dto) { Apostas entity =
	 * new Apostas(); entity.setHunch1(dto.getHunch1()); entity =
	 * repository.save(entity); return new ApostasDTO(entity); }
	 */
	
	public Apostas find(Long id) {
		Optional<Apostas> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
