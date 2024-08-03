package com.yohanesty.cs.solid.dip.before;

public class TwoHandSword {
	final String NAME;
    final int DAMAGE;

    TwoHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    int attack() {
        return DAMAGE;
    }
}
