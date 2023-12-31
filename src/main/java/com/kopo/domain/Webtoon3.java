package com.kopo.domain;

import org.springframework.web.multipart.MultipartFile;

public class Webtoon3 {
	private String name;
	private MultipartFile imageFile;
	private String author;
	private String publicationDay;
	private String ageLimit;
	private String description;
	private String website;
	private String genre;
	private String url;
	private String titleId;
	
	private double drawing;
	private double material;
	private double story;
	private double message;
	
	public Webtoon3(String name) {
		super();
		this.name = name;
	}
	
	public Webtoon3() {//기본생성자
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDay() {
		return publicationDay;
	}

	public void setPublicationDay(String publicationDay) {
		this.publicationDay = publicationDay;
	}

	public String getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(String ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public double getDrawing() {
		return drawing;
	}

	public void setDrawing(double drawing) {
		this.drawing = drawing;
	}

	public double getMaterial() {
		return material;
	}

	public void setMaterial(double material) {
		this.material = material;
	}

	public double getStory() {
		return story;
	}

	public void setStory(double story) {
		this.story = story;
	}

	public double getMessage() {
		return message;
	}

	public void setMessage(double message) {
		this.message = message;
	}

	
}
