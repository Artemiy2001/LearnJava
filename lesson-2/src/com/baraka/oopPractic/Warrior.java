package com.baraka.oopPractic;

import com.baraka.weapon.MeleeWeapon;
import com.baraka.weapon.Sword;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{


    public Warrior(String name, int heroHP, int heroDamage) {
        super(name, heroHP, heroDamage);

    }


    @Override
    public void attackEnemy(Enemy enemy){
        int criticalDamage = (int) (Math.random() * 3);
        if (criticalDamage == 2){
            enemy.takeDamage(getHeroDamage() * 2);
            System.out.println("Warrior attack enemy (critical damage): " + getHeroDamage() * 2 + " dmg");
        }else {
            System.out.println("Warrior attack enemy: " + getHeroDamage() + " dmg");
            enemy.takeDamage(getHeroDamage());
        }


    }

    @Override
    public boolean isAliveHero() {
        return getHeroHP() > 0;

    }
}
