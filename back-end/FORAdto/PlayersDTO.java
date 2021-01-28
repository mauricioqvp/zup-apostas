package com.devsuperior.dsapostas.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.dsapostas.entities.Apostas;
import com.devsuperior.dsapostas.entities.Players;

public class PlayersDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	
	private List<ApostasDTO> apostas = new ArrayList<>();
	
	public PlayersDTO() {
		
	}

	public PlayersDTO(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;		
	}
	
	public PlayersDTO(Players dto) {
		super();
		this.id = dto.getId();
		this.name = dto.getName();
		this.email = dto.getEmail();
	}
	
	public PlayersDTO(Players entity, Set<Apostas> apostas) {
		this(entity);
		apostas.forEach(cat -> this.apostas.add(new ApostasDTO(cat)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
