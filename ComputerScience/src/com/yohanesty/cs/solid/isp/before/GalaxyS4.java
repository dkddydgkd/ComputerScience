package com.yohanesty.cs.solid.isp.before;

public class GalaxyS4 implements SmartPhone {
	@Override
	public void call(String number) {
		// 구형 기종에 대해 구현하던 부분
	}
	@Override
	public void message(String number, String text) {
		// 구형 기종에 대해 구현하던 부분
	}
	// 아래 불필요한 기능에 대해 강제 구현 필요 
	@Override
	public void wirelessCharge() {
		// 구형 기종에 없는 기능
		System.out.println("지원하지 않는 기능.");
	}
	@Override
	public void AR() {
		// 구형 기종에 없는 기능
		System.out.println("지원하지 않는 기능.");
	}
	@Override
	public void biometrics() {
		// 구형 기종에 없는 기능
		System.out.println("지원하지 않는 기능.");
	}
}
