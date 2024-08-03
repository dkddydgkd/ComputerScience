package com.yohanesty.cs.solid.dip.after;

public class WarHammer implements Weaponable {
    final String NAME;
    final int DAMAGE;

    WarHammer(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    @Override
	public int attack() {
        return DAMAGE;
    }
}
