package com.yohanesty.cs.solid.ocp.before;

public class Zoo {

	public static void main(String[] args) {
		HelloAnimal helloAnimal = new HelloAnimal();
		
		Animal dog = new Animal("Dog");
		Animal cat = new Animal("Cat");
		
		helloAnimal.hello(dog);
		helloAnimal.hello(cat);
		
//		Animal sheep = new Animal("Sheep");
//		Animal lion = new Animal("Lion");
//		
//		helloAnimal.hello(sheep);
//		helloAnimal.hello(lion);
	}

}
