package tfrabaioli.DsListbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tfrabaioli.DsListbackend.dto.GameMinDTO;
import tfrabaioli.DsListbackend.services.GameService;

@RestController
@RequestMapping (value = "/games")
public class GameController {
	
	@Autowired
	private GameService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<GameMinDTO>> findAll(){
		List<GameMinDTO> result = service.findAll();
		return ResponseEntity.ok().body(result);
		
	}

}
