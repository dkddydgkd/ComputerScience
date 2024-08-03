package com.yohanesty.cs.solid.isp.before;

public interface SmartPhone {
	void call(String number); // 통화 기능
    void message(String number, String text); // 문제 메세지 전송 기능
    void wirelessCharge(); // 무선 충전 기능
    void AR(); // 증강 현실(AR) 기능
    void biometrics(); // 생체 인식 기능
}
