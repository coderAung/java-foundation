package edu.ucsy.oop.typecasting;

import edu.ucsy.oop.typecasting.domain.Animal;
import edu.ucsy.oop.typecasting.domain.Cat;
import edu.ucsy.oop.typecasting.domain.Dog;
import edu.ucsy.oop.typecasting.domain.Fish;
import edu.ucsy.oop.typecasting.domain.GoldFish;

public class Demo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Fish fish = new Fish();
		Cat cat = new Cat();
		
		Animal animal1 = dog; // implicit
		Animal animal2 = fish; // implicit
		Animal animal3 = cat; // implicit
		
		dog = (Dog) animal1; // explicit
		fish = (Fish) animal2;
		cat = (Cat) animal3;
		
		Animal someAnimal = new Fish();
		Dog dog2 = someAnimal instanceof Dog ? (Dog) someAnimal : null;
	
		GoldFish goldFish = new GoldFish();

		Animal anAnimal = goldFish;
		
		Cat someCat = anAnimal instanceof Cat ? (Cat) anAnimal : null;
	}
}
