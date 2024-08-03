package com.yohanesty.cs.solid.isp.after;

public interface Phone {
	public void call(String number); // 통화 기능
    public void message(String number, String text); // 문제 메세지 전송 기능
}
