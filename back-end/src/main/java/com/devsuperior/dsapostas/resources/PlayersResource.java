package com.devsuperior.dsapostas.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dsapostas.dto.PlayersDTO;
import com.devsuperior.dsapostas.services.PlayersService;


@RestController
@RequestMapping(value = "/players")
public class PlayersResource {
	
	@Autowired
	private PlayersService service;
	
	@PostMapping
	public ResponseEntity<PlayersDTO> insert(@RequestBody PlayersDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
