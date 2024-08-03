package com.yohanesty.cs.solid.dip.before;

public class WarHammer {
	final String NAME;
    final int DAMAGE;

    WarHammer(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    int attack() {
        return DAMAGE;
    }
}
