package tfrabaioli.DsListbackend.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private String score;
	private String img_url;
	
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	

	public Game() {};
	

	public Game(Long id, String title, String score, Integer year, String genre, String platforms, String img_url,
			String short_description, String long_description) {
		super();
		this.id = id;
		this.title = title;
		this.score = score;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.img_url = img_url;
		this.shortDescription = short_description;
		this.longDescription = long_description;
	}


	public Long getId() {
		return id;
	}


	
	
	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPlatforms() {
		return platforms;
	}


	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	public void setShortDescription(String short_description) {
		this.shortDescription = short_description;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String long_description) {
		this.longDescription = long_description;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
