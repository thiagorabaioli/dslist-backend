package tfrabaioli.DsListbackend.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import tfrabaioli.DsListbackend.dto.GameListDTO;

import tfrabaioli.DsListbackend.entities.GameList;
import tfrabaioli.DsListbackend.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repo;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> list = repo.findAll();
		List<GameListDTO> listDto = list.stream().map(x -> new GameListDTO(x)).toList();
		return listDto;
	}
	
	

}
