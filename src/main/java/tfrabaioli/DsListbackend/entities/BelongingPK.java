package tfrabaioli.DsListbackend.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	
	@ManyToOne
	@JoinColumn(name= "game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name="list_id")
	private GameList gamelist;
	
	public BelongingPK() {}

	public BelongingPK(Game game, GameList gamelist) {
		super();
		this.game = game;
		this.gamelist = gamelist;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getGamelist() {
		return gamelist;
	}

	public void setGamelist(GameList gamelist) {
		this.gamelist = gamelist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, gamelist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(gamelist, other.gamelist);
	}
	
	

}
