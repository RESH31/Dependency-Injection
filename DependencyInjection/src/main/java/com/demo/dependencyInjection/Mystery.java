package com.demo.dependencyInjection;
import org.springframework.stereotype.Component;

@Component("mystery")
public class Mystery implements Book {

	public void BookGenres() {
		System.out.println("Book Genres: Mystery");
		
	}

}
