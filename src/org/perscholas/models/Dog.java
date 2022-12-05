package org.perscholas.models;

public class Dog extends Animals {
	//field
	private String habitat;
	
	//constructors
	public Dog() {}

	public Dog(String name, String color, int age) {
		super(name,color,age);
	}
	
   //methods
	public void findDogHabitat() {
		this.habitat = findHabitat(super.getName());
	}
	
	public void eat() {
		System.out.println("The Dog eats bones");
	}

	
	//getters and setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
