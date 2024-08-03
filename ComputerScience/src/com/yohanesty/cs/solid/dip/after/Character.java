package com.yohanesty.cs.solid.dip.after;

public class Character {
    final String NAME;
    int health;
    Weaponable weapon; // 의존 고수준 객체로 변경

    Character(String name, int health, Weaponable weapon) {
        this.NAME = name;
        this.health = health;
        this.weapon = weapon;
    }

    int attack() {
        return weapon.attack(); // 각 변경된 무기에 따라 공격 데미지 활성화
    }

    void changeWeapon(Weaponable weapon) { // 의존적이지 않은 무기 변경
        this.weapon = weapon;
    }

    void getInfo() {
        System.out.println("이름: " + NAME);
        System.out.println("체력: " + health);
        System.out.println("무기: " + weapon);
    }
}
