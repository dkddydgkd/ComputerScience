package com.yohanesty.cs.solid.lsp.after;

public class Dog extends Animal implements Speakable{
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}