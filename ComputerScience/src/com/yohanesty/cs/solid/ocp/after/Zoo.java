package com.yohanesty.cs.solid.ocp.after;

public class Zoo {

	public static void main(String[] args) {
		HelloAnimal hello = new HelloAnimal();

        Animal cat = new Cat(); // 추가에 따른 확장(추상화된 Animal 클래스만 상속)
        Animal dog = new Dog();

        hello.hello(cat); // 메소드 재정의라 인터페이스로 추상화도 가능하다.
        hello.hello(dog);
        
//		Animal sheep = new Animal("Sheep");
//		Animal lion = new Animal("Lion");
//		
//		helloAnimal.hello(sheep);
//		helloAnimal.hello(lion);
	}

}
