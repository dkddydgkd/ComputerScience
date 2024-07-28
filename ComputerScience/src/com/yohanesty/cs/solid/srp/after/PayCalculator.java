package com.yohanesty.cs.solid.srp.after;

//* 회계팀에서 사용되는 전용 클래스
public class PayCalculator {
	// * 초과 근무 시간을 계산하는 메서드
    void calculateExtraHour() {
        // ...
    }
    void calculatePay() {
        // ...
        this.calculateExtraHour();
        // ...
    }
}
