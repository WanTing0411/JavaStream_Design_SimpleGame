package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public abstract class Player implements Interactions {
  // TODO: Add missing attributes.
    private Weapon weapon;
    private List<Armor> armor;

    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health;
    protected int level;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType){
        this.name=name;
        this.specification=specification;
        this.amountOfArmor=amountOfArmor;
        this.armor=armor;
        this.weapon=weapon;
        this.weaponType=weaponType;
        health=200;

    }
    protected Player(String name, List<Armor> armor, Weapon weapon, String weaponType) {
        this.weapon = weapon;
        this.armor = armor;
        this.name = name;
        this.weaponType = weaponType;
        health=200;
    }
    protected boolean isDead(){
        return false;
    }

    protected void equipItems(){

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    // TODO: Implement part 3.


}
