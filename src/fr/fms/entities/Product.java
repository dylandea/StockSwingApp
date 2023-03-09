package fr.fms.entities;

public class Product {
	private int id;
	private String description;
	private String brand;
	private double price;
	private int category;
	
public Product(int id, String description, String brand, double price, int category) {

	this.id = id;
	this.description = description;
	this.brand = brand;
	this.price = price;
	this.category = category;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
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

public int getCategory() {
	return category;
}

public void setCategory(int category) {
	this.category = category;
}

@Override
public String toString() {
	return "Product [id=" + id + ", description=" + description + ", brand=" + brand + ", price=" + price
			+ ", category=" + category + "]";
}


	
}