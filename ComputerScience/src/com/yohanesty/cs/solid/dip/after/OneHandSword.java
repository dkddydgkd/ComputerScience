package com.yohanesty.cs.solid.dip.after;

public class OneHandSword implements Weaponable {
    final String NAME;
    final int DAMAGE;

    OneHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    @Override
	public int attack() {
        return DAMAGE;
    }
}
