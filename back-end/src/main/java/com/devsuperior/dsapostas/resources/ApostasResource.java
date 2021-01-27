package com.devsuperior.dsapostas.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dsapostas.dto.ApostasDTO;
import com.devsuperior.dsapostas.services.ApostasService;

@RestController
@RequestMapping(value = "/apostas")
public class ApostasResource {
	
	@Autowired
	private ApostasService service;
	
	@PostMapping
	public ResponseEntity<ApostasDTO> insert(@RequestBody ApostasDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
