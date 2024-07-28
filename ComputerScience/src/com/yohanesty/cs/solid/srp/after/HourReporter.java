package com.yohanesty.cs.solid.srp.after;

//* 인사팀에서 사용되는 전용 클래스
public class HourReporter {
	// * 초과 근무 시간을 계산하는 메서드
    void calculateExtraHour() {
        // ...
    }
    void reportHours() {
        // ...
        this.calculateExtraHour();
        // ...
    }
}
