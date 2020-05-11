package com.demo.dependencyInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fantasy")
public class Fantasy implements Book {

	@Autowired
	private SubCategory subCategory;
	
	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	
	public void BookGenres() {
		subCategory.setSubCategory("Magical");
		System.out.println("Book Genres:"+subCategory+"Fantasy");
		
	}

}
