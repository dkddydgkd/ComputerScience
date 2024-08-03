package com.yohanesty.cs.solid.isp.after;

public class GalaxyS22 implements Phone, WirelessChargable, ARable, Biometricsable, AIable {
	@Override
	public void call(String number) {
		// 신규 기종에 대해 변경된 부분
	}
	@Override
	public void message(String number, String text) {
		// 신규 기종에 대해 변경된 부분
	}
	@Override
	public void wirelessCharge() {
		// 신규 기종에 대해 변경된 부분	
	}
	@Override
	public void AR() {
		// 신규 기종에 대해 변경된 부분	
	}
	@Override
	public void biometrics() {
		// 신규 기종에 대해 변경된 부분	
	}
	@Override
	public void AIBot() {
		// 신규 기종에 대해 추가된 부분
	}
}
