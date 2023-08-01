package tfrabaioli.DsListbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfrabaioli.DsListbackend.dto.GameMinDTO;
import tfrabaioli.DsListbackend.entities.Game;
import tfrabaioli.DsListbackend.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repo;
	
	public List<GameMinDTO> findAll(){
		List<Game> list = repo.findAll();
		List<GameMinDTO> listDto = list.stream().map(x -> new GameMinDTO(x)).toList();
		return listDto;
	}
	
	

}
