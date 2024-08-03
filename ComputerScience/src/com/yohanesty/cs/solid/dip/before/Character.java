package com.yohanesty.cs.solid.dip.before;

public class Character {
    final String NAME;
    int health;
    OneHandSword weapon; // 의존 저수준 객체

    Character(String name, int health, OneHandSword weapon) {
        this.NAME = name;
        this.health = health;
        this.weapon = weapon;
    }

    int attack() {
        return weapon.attack(); // 의존 객체에서 메서드를 실행하여 제한된 데미지
    }

    void changeWeapon(OneHandSword weapon) { // 의존적인 무기로 인해 변경 불가
        this.weapon = weapon;
    }

    void getInfo() {
        System.out.println("이름: " + NAME);
        System.out.println("체력: " + health);
        System.out.println("무기: " + weapon);
    }
}
