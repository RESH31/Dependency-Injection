package com.demo.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fiction")
public class Fiction implements Book{

	@Autowired
	private SubCategory subCategory;
	
	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	
	public void BookGenres() {
		subCategory.setSubCategory("Historical");
		System.out.println("Book Genres:"+subCategory+"Fiction");
		
	}


	
}
