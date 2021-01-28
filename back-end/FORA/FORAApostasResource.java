package com.devsuperior.dsapostas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsapostas.entities.Apostas;
import com.devsuperior.dsapostas.services.ApostasService;

@RestController
@RequestMapping(value = "/apostas")
public class ApostasResource {

	@Autowired
	private ApostasService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Apostas obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
