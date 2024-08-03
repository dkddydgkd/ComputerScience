package com.yohanesty.cs.solid.ocp.before;

public class HelloAnimal {
	void hello(Animal animal) {
		// 지속적인 동물 추가 시, 수정에 민감한 코드
        if(animal.type.equals("Cat")) {
            System.out.println("냐옹");
        } else if(animal.type.equals("Dog")) {
            System.out.println("멍멍");
        }
//		else if (animal.type.equals("Sheep")) {
//	        System.out.println("메에에");
//	    } else if (animal.type.equals("Lion")) {
//	        System.out.println("어흥");
//	    } else {
//	    	
//	    }
	}
}
