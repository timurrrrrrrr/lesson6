package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Skeleton = new Boss();
        Skeleton.setDamage(100);
        Skeleton.setHealth(200);

        Weapon weapon = new Weapon();
        weapon.setGun("Sword");

        System.out.println("Информация о босе:" + " " +" Урон = " + Skeleton.getDamage() + "," + " " + " Жизнь = " + Skeleton.getHealth() +
                "," + " " + weapon.getSword() + ".");
    }
}
