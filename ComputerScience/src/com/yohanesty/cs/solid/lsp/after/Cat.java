package com.yohanesty.cs.solid.lsp.after;

public class Cat extends Animal implements Speakable{
	@Override
	public void speak() {
		System.out.println("냐옹");
	}
}