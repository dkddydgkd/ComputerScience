package com.yohanesty.cs.solid.lsp.after;

public class Fish extends Animal{	
	// 기존 미사용 기능에 대해 상속되는 기능을 인터페이스 구현으로, 제거가능
//	public void speak() {
//		try {
//			throw new Exception("물고기는 말할 수 없음.");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
}