package com.fahim.cured.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class ProductDto {

	//Data Transfer Object (DTO)
	@NotEmpty(message="The name is required")
	private String name;
	@NotEmpty(message="The category name is required")
	private String category;

	@NotEmpty(message="The Brand name is required")
	private String brand;

	@Min(0)
	private double price;

	@Size(min=10,message="The description should be at least 10 characters")
	@Size(max=2000,message="The description cannot excsed 2000 character")
	private String description;


	private MultipartFile imageFile;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public MultipartFile getImageFile() {
		return imageFile;
	}


	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}


	
	
	

}
