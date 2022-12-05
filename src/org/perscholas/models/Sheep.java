package org.perscholas.models;

    public class Sheep extends Animals {
	//field
	private String habitat;
	
	//constructors
	public Sheep() {
		super();
	}

	public Sheep(String name, String color, int age) {
		super(name,color,age);
	}
	
   //methods
	public void findSheepHabitat() {
		if(this.habitat==null)
		findHabitat(super.getName());
		else
			System.out.println("The sheep lives in "+this.habitat);
	}
	
	public void eat() {
		System.out.println("The Sheep eats grass");
	}

	
	//getters and setters
	public String getHabitat() {
		if(this.habitat==null)
		this.habitat = findHabitat(super.getName());
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
