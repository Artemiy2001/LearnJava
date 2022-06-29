package com.baraka.oopPractic;

public class Enemy implements Mortal {

    private int heals;
    private int enemyDamage;

    public Enemy(int heals, int enemyDamage){
        this.heals = heals;
        this.enemyDamage = enemyDamage;
    }

    public void takeDamage(int damage){
        this.heals -= Math.min(heals, damage);
    }

    public void attackHero(Hero hero){
        hero.takeHeroDamage(enemyDamage);
        System.out.println("Enemy attack " + hero.getName() + ": " + enemyDamage + " dmg");
    }

    public boolean isAlive(){
        return heals > 0;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }
}
