package tfrabaioli.DsListbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tfrabaioli.DsListbackend.dto.GameDTO;
import tfrabaioli.DsListbackend.dto.GameListDTO;
import tfrabaioli.DsListbackend.dto.GameMinDTO;
import tfrabaioli.DsListbackend.services.GameListService;
import tfrabaioli.DsListbackend.services.GameService;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<GameListDTO>> findAll(){
		List<GameListDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
		
	}
	
	
}
