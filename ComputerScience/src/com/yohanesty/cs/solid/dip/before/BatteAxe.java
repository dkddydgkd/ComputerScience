package com.yohanesty.cs.solid.dip.before;

public class BatteAxe {
	final String NAME;
    final int DAMAGE;

    BatteAxe(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    int attack() {
        return DAMAGE;
    }
}
