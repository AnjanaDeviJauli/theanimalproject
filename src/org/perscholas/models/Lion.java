package org.perscholas.models;

public class Lion extends Animals {
	//field
	private static String habitat;
	
	//constructors
	public Lion() {}

	public Lion(String name, String color, int age) {
		super(name,color,age);
	}
	
//comment
	
   //methods
	public void findLionHabitat() {
		this.habitat = findHabitat(super.getName());
	}
	
	public void eat() {
		System.out.println("The Lion hunts other animals to eat");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"The habitat is "+this.habitat;
	}

	//getters and setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
