package org.example;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Nurullah",100,Weapon.AXE);
        System.out.println("healthremaining" + player.healthRemaining());

        Player player2 = new Player("Mehmet",90,Weapon.SWORD);
        System.out.println("healthremaining"+player2.healthRemaining());

        player.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));

        System.out.println("healthremaining after damage:" +player.healthRemaining());

        player.restoreHealth(70);
        System.out.println("healthremaining after restore: " +player.healthRemaining());
    }
}