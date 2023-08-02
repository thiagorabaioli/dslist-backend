package tfrabaioli.DsListbackend.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tfrabaioli.DsListbackend.dto.GameListDTO;
import tfrabaioli.DsListbackend.dto.GameMinDTO;
import tfrabaioli.DsListbackend.services.GameListService;
import tfrabaioli.DsListbackend.services.GameService;


@RestController
@RequestMapping (value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	@Autowired
	private GameService gameService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<GameListDTO>> findAll(){
		List<GameListDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
		
	}
	
	@RequestMapping(value="/{id}/games",method = RequestMethod.GET)
	public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long id){
		List<GameMinDTO> result = gameService.findByList(id);
		return ResponseEntity.ok().body(result);
		
	}
	
	
	
}
