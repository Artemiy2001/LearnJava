package com.baraka.weapon;

import com.baraka.oopPractic.Archer;
import com.baraka.oopPractic.Hero;
import com.baraka.oopPractic.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<Bow>("Archer", 200, 10);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Warrior", 230, 12);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){
        System.out.println(hero.getWeapon().getDamage());
    }
}
