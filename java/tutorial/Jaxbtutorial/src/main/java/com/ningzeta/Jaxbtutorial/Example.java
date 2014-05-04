package com.ningzeta.Jaxbtutorial;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Example {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.setTitle("Unforgiven");
		movie.setImdbUrl("http://www.imdb.com/title/tt3358060/");
		movie.setImdbID("tt3358060");
		
		Details details = new Details();
		details.setGenre("Action,Drama,History,War");
		details.setLanguage("English");
		details.setYear("1992");
		movie.setDetails(details);
		
		try{
			File xmlWriter = new File("movie.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Movie.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			System.out.println("Converting Object to XML");
			jaxbMarshaller.marshal(movie, xmlWriter);
			jaxbMarshaller.marshal(movie, System.out);
			
			System.out.println("===================================================");
			System.out.println("Converting XML to Object");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Movie movieUnmarshall = (Movie) jaxbUnmarshaller.unmarshal(xmlWriter);
			System.out.println(movieUnmarshall);


		}
		catch(JAXBException ex){
			ex.printStackTrace();
		}
	}

}
