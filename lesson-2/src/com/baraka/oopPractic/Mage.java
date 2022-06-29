package com.baraka.oopPractic;

import com.baraka.weapon.MagicWeapon;
import com.baraka.weapon.Wand;

public class Mage<T extends MagicWeapon> extends Hero<T>{

    public Mage(String name, int heroHP, int heroDamage) {
        super(name, heroHP, heroDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getHeroDamage());
        setHeroHP(getHeroHP() + (getHeroDamage() / 2));
        System.out.println("Mage attack enemy: " + getHeroDamage() + " dmg");
        System.out.println("Mage cured on " + (getHeroDamage() / 2) + " hp");
    }


    @Override
    public boolean isAliveHero() {
        return getHeroHP() > 0;
    }
}
