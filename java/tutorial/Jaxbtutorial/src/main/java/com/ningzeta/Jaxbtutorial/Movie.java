package com.ningzeta.Jaxbtutorial;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://www.ningzeta.com/1.0")
class Movie {
	
	String imdbID;
	String imdbUrl;
	String title;
	Details details;

	public String getImdbID() {
		return imdbID;
	}
	
	@XmlElement(name="imdbid")
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	public String getImdbUrl() {
		return imdbUrl;
	}
	
	@XmlElement(name="imdburl")
	public void setImdbUrl(String imdbUrl) {
		this.imdbUrl = imdbUrl;
	}
	
	public String getTitle() {
		return title;
	}
	
	@XmlElement(name="title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Details getDetails() {
		return details;
	}
	
	@XmlElement
	public void setDetails(Details details) {
		this.details = details;
	}
}

@XmlRootElement
class Details{
	String language;
	String genre;
	String year;
	
	public String getLanguage() {
		return language;
	}
	
	@XmlElement
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getGenre() {
		return genre;
	}
	
	@XmlElement(name="genres")
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getYear() {
		return year;
	}
	
	@XmlElement
	public void setYear(String year) {
		this.year = year;
	}
}

