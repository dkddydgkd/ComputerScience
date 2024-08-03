package com.yohanesty.cs.solid.lsp.before;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<>(); 
		
		animalList.add(new Cat());
		animalList.add(new Dog());
		animalList.add(new Fish());
		
		for(Animal animal : animalList) {
			animal.print(); // 공통 기능
			// 신규 생성에 대해 모르고 상위 개념에 대해 사용하는 경우
			// 호출부에서는 오류 도출은 없으나 Fish 에서 Exception 발생
			// 잘못된 상속 위배는 연속적인 예외 처리를 위해 호출부 변경 필요
			animal.speak();
		}
	}

}
