package tfrabaioli.DsListbackend.dto;

import tfrabaioli.DsListbackend.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String img_url;
	private String shortDescription;
	
	public GameMinDTO() {}

	public GameMinDTO(Long id, String title, Integer year, String img_url, String shortDescription) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.img_url = img_url;
		this.shortDescription = shortDescription;
	}
	
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.img_url = entity.getImg_url();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImg_url() {
		return img_url;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	


}
