package com.demo.dependencyInjection;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
    	System.out.print("Select any one(1,2,3): 1.Fantasy,2.Mystery,3.Fiction");
        int option = userInputScanner.nextInt();
        
    	Config c=new Config();
    	Book book=c.getObject(option);
    	book.BookGenres();

	}

}
