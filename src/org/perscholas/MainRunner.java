package org.perscholas;

import org.perscholas.models.Animals;
import org.perscholas.models.Dog;
import org.perscholas.models.Lion;
import org.perscholas.models.Sheep;

public class MainRunner {

	public static void main(String[] args) {
	
		Animals A = new Animals("SomeAnimal","SomeColor",11);
		System.out.println(A.toString());
		
		Animals B= new Dog("Dog","brown",2);
		Dog C = (Dog)B;
				
		
		System.out.println(A.toString());
		C.findDogHabitat();
		C.eat();
		
		Lion L = new Lion("Lion","white",5);
		System.out.println("The age of the lion is "+L.getAge());
		L.eat();
		L.findLionHabitat();
		L.setAge(6);
		System.out.println(L.toString());
		L.setHabitat("Jungle");
		System.out.println(L.toString());
		
		Sheep S = new Sheep();
		System.out.println(S.toString());
		Sheep S1 = new Sheep("Sheep","black",5);
		System.out.println(S1.toString());
		System.out.println(S1.getHabitat());
		S1.setHabitat("Zoo");
		System.out.println(S1.getHabitat());
		S1.findSheepHabitat();
		
		Sheep S2 = new Sheep();
		
		
		
		
		S2.setName("Shout");
		System.out.println(S2.toString());
		S2.findSheepHabitat();
		S2.eat();
		System.out.println(L.toString());
		
		
	}

}
