package com.baraka.oopPractic;

public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(310, 60);

        Hero warrior = new Warrior("Warrior", 200, 20);

        Hero mage = new Mage("Mage", 100, 40);

        Hero archer = new Archer("Archer", 120, 50);

        while (enemy.isAlive()){
          battle(enemy, warrior, mage, archer);
          if (!warrior.isAliveHero() && !mage.isAliveHero() && !archer.isAliveHero()){
              System.out.println("All heroes dies, enemy win!!!");
              break;
          }
        }


    }

    private static void battle(Enemy enemy, Hero... heroes) {

        for (Hero hero: heroes){

            if (hero.isAliveHero()){
                hero.attackEnemy(enemy);
                if(!enemy.isAlive()){
                    System.out.println("Enemy died, heroes win!!!");
                    break;
                }
                System.out.println("Enemy heals: " + enemy.getHeals());
            }


            if (hero.isAliveHero()){
                enemy.attackHero(hero);
                if (!hero.isAliveHero()){
                    System.out.println(hero.getName() + " died");
                    System.out.println();
                    continue;
                }
                System.out.println(hero.getName() + " heals: " + hero.getHeroHP());
                System.out.println();
            }
        }
    }
}
