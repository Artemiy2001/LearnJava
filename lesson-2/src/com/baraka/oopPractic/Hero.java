package com.baraka.oopPractic;

public abstract class Hero<T> {

    private final String name;
    private int heroHP;
    private int heroDamage;

    private T weapon;


    public Hero(String name, int heroHP, int heroDamage) {
        this.name = name;
        this.heroHP = heroHP;
        this.heroDamage = heroDamage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract boolean isAliveHero();

    public void takeHeroDamage(int enemyDamage){
        this.heroHP -= Math.min(heroHP, enemyDamage);
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHeroHP() {
        return heroHP;
    }

    public void setHeroHP(int heroHP) {
        this.heroHP = heroHP;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }
}
