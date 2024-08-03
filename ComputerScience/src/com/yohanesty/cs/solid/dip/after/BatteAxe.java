package com.yohanesty.cs.solid.dip.after;

public class BatteAxe implements Weaponable {
    final String NAME;
    final int DAMAGE;

    BatteAxe(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    @Override
	public int attack() {
        return DAMAGE;
    }
}
