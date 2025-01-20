package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name,int healthPercentage,Weapon weapon){
        this.name=name;
        this.healthPercentage=healthPercentage;
        checkAndSetHealth(healthPercentage);
        this.weapon=weapon;
    }

    private void checkAndSetHealth(int healthPercentage) {
        if (healthPercentage<0){
            this.healthPercentage = 0;
        }
        if (healthPercentage>100){
            this.healthPercentage = 100;
        }
    }

    public Weapon getWeapon(){
        return this.weapon;
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
        int healthRemain = healthPercentage-damage;
        if (healthRemain <= 0){
            System.out.println(name + " player has been knocked out of game");
        }
        healthRemain = healthRemain;
        checkAndSetHealth(healthPercentage);
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        checkAndSetHealth(this.healthPercentage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "weapon=" + weapon +
                ", healthPercentage=" + healthPercentage +
                ", name='" + name + '\'' +
                '}';
    }



}
