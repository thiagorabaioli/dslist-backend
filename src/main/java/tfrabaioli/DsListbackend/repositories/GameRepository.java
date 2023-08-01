package tfrabaioli.DsListbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfrabaioli.DsListbackend.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
