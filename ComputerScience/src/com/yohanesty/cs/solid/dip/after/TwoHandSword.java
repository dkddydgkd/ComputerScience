package com.yohanesty.cs.solid.dip.after;

public class TwoHandSword implements Weaponable {
    final String NAME;
    final int DAMAGE;

    TwoHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    @Override
	public int attack() {
        return DAMAGE;
    }
}
