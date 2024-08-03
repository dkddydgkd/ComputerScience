package com.yohanesty.cs.solid.isp.after;

public class GalaxyS4 implements Phone {
	@Override
	public void call(String number) {
		// 구형 기종에 대해 구현하던 부분
	}
	@Override
	public void message(String number, String text) {
		// 구형 기종에 대해 구현하던 부분
	}
	// 인터페이스 분리로 인해 구형 기종에서 불필요한 구현부 제거 가능
//	@Override
//	public void wirelessCharge() {
//		// 구형 기종에 없는 기능
//		System.out.println("지원하지 않는 기능.");
//	}
//	@Override
//	public void AR() {
//		// 구형 기종에 없는 기능
//		System.out.println("지원하지 않는 기능.");
//	}
//	@Override
//	public void biometrics() {
//		// 구형 기종에 없는 기능
//		System.out.println("지원하지 않는 기능.");
//	}
}
