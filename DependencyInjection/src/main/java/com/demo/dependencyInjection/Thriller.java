package com.demo.dependencyInjection;

import org.springframework.stereotype.Component;

@Component("incorrectOption")
public class Thriller implements Book{

	public void BookGenres() {
		System.out.println("Option Incorrect");
		
	}

}
