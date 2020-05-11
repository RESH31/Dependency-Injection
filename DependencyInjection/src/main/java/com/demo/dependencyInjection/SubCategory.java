package com.demo.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SubCategory {

	private String subCategory;

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
	@Override
	public String toString() {
		return subCategory;
	}

	public void DisplaySubCategory()
	{
		System.out.println("subCategory is "+subCategory);
	}
}
