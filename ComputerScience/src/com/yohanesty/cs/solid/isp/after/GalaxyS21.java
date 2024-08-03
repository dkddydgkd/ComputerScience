package com.yohanesty.cs.solid.isp.after;

public class GalaxyS21 implements Phone, WirelessChargable, ARable, Biometricsable {
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
}
