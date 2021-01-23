package com.devsuperior.dsapostas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsapostas.entities.Players;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Long> {

	
}
