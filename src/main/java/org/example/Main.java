package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());


        System.out.println("----------------------------------------------------");



        Player playerSword = new Player("Arthur", 90, Weapon.SWORD);
        System.out.println(playerSword.healthRemaining());
        playerSword.loseHealth(20);
        System.out.println(playerSword.healthRemaining());
        playerSword.restoreHealth(50);
        System.out.println(playerSword.healthRemaining());

        System.out.println("--------------------");


        Player playerAxe = new Player("Morgan", 110, Weapon.AXE); // health > 100
        System.out.println(playerAxe.healthRemaining());
        playerAxe.loseHealth(40);
        System.out.println(playerAxe.healthRemaining());
        playerAxe.restoreHealth(30);
        System.out.println(playerAxe.healthRemaining());

        System.out.println("--------------------");


        Player playerBow = new Player("Legolas", 50, Weapon.BOW);
        System.out.println(playerBow.healthRemaining());
        playerBow.loseHealth(60);
        System.out.println(playerBow.healthRemaining());
        playerBow.restoreHealth(70);
        System.out.println(playerBow.healthRemaining());

        System.out.println("--------------------");


        Player playerDagger = new Player("Shadow", -20, Weapon.DAGGER); // health < 0
        System.out.println(playerDagger.healthRemaining());
        playerDagger.restoreHealth(40);
        System.out.println(playerDagger.healthRemaining());
        playerDagger.loseHealth(50);
        System.out.println(playerDagger.healthRemaining());






































    }

}