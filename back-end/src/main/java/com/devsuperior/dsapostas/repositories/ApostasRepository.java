package com.devsuperior.dsapostas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsapostas.entities.Apostas;

public interface ApostasRepository extends JpaRepository<Apostas, Long>{

}
