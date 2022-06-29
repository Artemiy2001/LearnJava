package com.baraka.oopPractic;

import com.baraka.weapon.Bow;
import com.baraka.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{

    public Archer(String name, int heroHP, int heroDamage) {
        super(name, heroHP, heroDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attack enemy: " + getHeroDamage() + " dmg");
        enemy.takeDamage(getHeroDamage());
    }


    @Override
    public boolean isAliveHero() {
        return getHeroHP() > 0;
    }

}
