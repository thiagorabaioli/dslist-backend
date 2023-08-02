package tfrabaioli.DsListbackend.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfrabaioli.DsListbackend.dto.GameDTO;
import tfrabaioli.DsListbackend.dto.GameMinDTO;
import tfrabaioli.DsListbackend.entities.Game;
import tfrabaioli.DsListbackend.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repo;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> list = repo.findAll();
		List<GameMinDTO> listDto = list.stream().map(x -> new GameMinDTO(x)).toList();
		return listDto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game obj = repo.findById(id).get();
		GameDTO dto = new GameDTO(obj);
		return dto;
	}
	
	

}
