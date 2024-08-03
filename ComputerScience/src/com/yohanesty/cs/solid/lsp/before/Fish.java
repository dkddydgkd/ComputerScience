package com.yohanesty.cs.solid.lsp.before;

public class Fish extends Animal{
	// 기존 미사용 기능에 대해 상속되는 기능으로, 제거불가하여 예외처리를 해야함
	public void speak() {
		try {
			throw new Exception("물고기는 말할 수 없음.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}