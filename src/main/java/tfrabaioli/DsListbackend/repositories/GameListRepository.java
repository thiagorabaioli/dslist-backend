package tfrabaioli.DsListbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tfrabaioli.DsListbackend.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
