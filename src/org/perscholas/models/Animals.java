package org.perscholas.models;

public class Animals {

	// fields

	private String name;
	private String color;
	private int age;

	// constructors


	public Animals(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Animals() {
		this("SomeAnimal","SomeColor",0);
	}

	// methods

	@Override
	public String toString() {
		return "Animals [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	    protected String findHabitat(String animal) {
		if(animal=="Dog") {
			System.out.println("Dog lives in house as a pet");
			return "House";
		}else if(animal=="Lion") {
			System.out.println("Lion lives in a forest");
			return "Forest";
		}else if(animal=="Sheep")
		{
			System.out.println("Sheep lives in a farm");
			return "farm";
		}else {
			System.out.println("The animal lives in this world");
			return "world";
		}
		
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
