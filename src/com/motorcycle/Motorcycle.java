package com.motorcycle;

public class Motorcycle {
	//Properties
	protected String model;
	protected String color;
	protected String bikeType;
	protected String transmission;
	protected String engineType;
	protected int topSpeed;
	
	
	//Constructor
	public Motorcycle(String model, String color, String bikeType, String transmission, String engineType, int topSpeed){
		this.model = model;
		this.color = color;
		this.bikeType = bikeType;
		this.transmission = transmission;
		this.engineType = engineType;
		this.topSpeed = topSpeed;
	}
	
	//Getters Method
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getBikeType() {
		return this.bikeType;
	}
	
	public String transmission() {
		return this.transmission;
	}
	
	public String getEngineType() {
		return this.engineType;
	}
	
	public int getTopSpeed() {
		return this.topSpeed;
	}
	
	//Methods
	public void showSpecs() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Bike Type: " + bikeType);
		System.out.println("Transmission: " + transmission);
		System.out.println("Engine Type: " + engineType);
		System.out.println("Top Speed: " + topSpeed + " km/h");
		System.out.println(" ");
	}
	
	public void engineSound() {
		System.out.println("Broom!");
	}
	
	public void gear(int x) {
		if (x <= 6) {
			if (x == 1) {
				System.out.println("The bike is on 1st gear!");
				System.out.println(" ");
			} else if (x == 2) {
				System.out.println("The bike is on 2nd gear!");
				System.out.println(" ");
			} else if (x == 3) {
				System.out.println("The bike is on 3rd gear!");
				System.out.println(" ");
			} else if (x == 4) {
				System.out.println("The bike is on 4th gear!");
				System.out.println(" ");
			} else if (x == 5) {
				System.out.println("The bike is on 5th gear!");
				System.out.println(" ");
			} else if (x == 6) {
				System.out.println("The bike is on 6th gear!");
				System.out.println(" ");
			} else {
				System.out.println("The bike is on neutral!");
				System.out.println(" ");
			}
		} else {
			System.out.println("Warning: Invalid shifting!");
			System.out.println(" ");
		}
	}
}
