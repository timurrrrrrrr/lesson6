package com.company;

public class  Boss extends GameEntity {
/*
    int health;
    String typeAttack;
    int damage;


    public Boss(int health,String typeAttacks,String weapon,int damage){
        this.setHealth(health);
        this.setDamage(damage);
        this.setTypeAttack(typeAttacks);
        this.setWeapon(weapon);

    }

    public Boss() {

    }
    public String info() {
        return "health:" + health + "damage:" + damage + "typeAttack:" + typeAttack + "weapon:" + weapon + "guantity";
    }
    */
private int damage;
    private int health;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
