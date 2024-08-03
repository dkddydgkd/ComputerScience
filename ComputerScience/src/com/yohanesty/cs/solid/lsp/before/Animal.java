package com.yohanesty.cs.solid.lsp.before;

abstract class Animal {
	public void print() {
		System.out.println("나는 동물이다");
	}
	abstract void speak();
}