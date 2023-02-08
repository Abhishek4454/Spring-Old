package com.coding.SpringProject;

public class Tyre {
	
	private String brand ;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	

}
