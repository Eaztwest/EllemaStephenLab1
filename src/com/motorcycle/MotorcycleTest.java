package com.motorcycle;

public class MotorcycleTest {

	public static void main(String[] args) {
		/* Constructor parameters:
		    Motorcycle(String model, String color, String bikeType, String transmission, String engineType, int topSpeed)
		*/
		
		//Object 1
		Motorcycle kawasaki1 = new Motorcycle("Ninja 400", "Black", "Sportsbike", "Manual", "Four Stroke, Twin Cylinder", 190);
		kawasaki1.showSpecs();
		kawasaki1.engineSound();
		kawasaki1.gear(6);
		
		//Object 2
		Motorcycle honda1 = new Motorcycle("CB650R", "Red", "Naked Sportsbike", "Manual", "Inline four", 220);
		honda1.showSpecs();
		honda1.engineSound();
		honda1.gear(3);
		
		//Object 3
		Motorcycle yamaha1 = new Motorcycle("R1", "Blue", "Supersports", "Manual", "Inline four", 300);
		yamaha1.showSpecs();
		yamaha1.engineSound();
		yamaha1.gear(1);
		
		//Object 4 
		Motorcycle suzuki1 = new Motorcycle("SV 650", "White", "Naked Sportsbike", "Manual", "V-Twin", 200);
		suzuki1.showSpecs();
		suzuki1.engineSound();
		suzuki1.gear(0);
	}

}
