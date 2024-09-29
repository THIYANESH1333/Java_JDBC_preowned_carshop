package com.thiyaneshcarshop;

public class cars{
	String brand;
	String name1;
	int price;
	int milage;
	int  id;


	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
	
	@Override
	public String toString() {
		return "cars [brand=" + brand + ", name=" + name1 + ", price=" + price + ", milage=" + milage + "]";
	}
	

}
