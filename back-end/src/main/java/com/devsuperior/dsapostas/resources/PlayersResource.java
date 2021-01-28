package com.devsuperior.dsapostas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsapostas.entities.Players;
import com.devsuperior.dsapostas.services.PlayersService;

@RestController
@RequestMapping(value = "/players")
public class PlayersResource {
	
	// CAP 17, 6:55seg
	/*
	 * @RequestMapping(method=RequestMethod.GET) public List<Players> listar() {
	 * Players pl1 = new Players(4l, "mauricio", "mauricio@gmail.com"); Players pl2
	 * = new Players(5l, "carla", "carla@gmail.com");
	 * 
	 * List<Players> list = new ArrayList<>(); list.add(pl1); list.add(pl2);
	 * 
	 * return list; }
	 */
	
	
	@Autowired
	private PlayersService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Players obj = service.findX(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * @PostMapping public ResponseEntity<PlayersDTO> insert(@RequestBody PlayersDTO
	 * dto) { dto = service.insert(dto); URI uri =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	 * .buildAndExpand(dto.getId()).toUri(); return
	 * ResponseEntity.created(uri).body(dto); }
	 */

}
