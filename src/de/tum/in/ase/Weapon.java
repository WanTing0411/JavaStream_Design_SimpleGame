package de.tum.in.ase;

public class Weapon extends Item {
  // TODO: Implement part 2.
    private int damage;
    public Weapon(String weaponType, String specification, int damage, int strength, int intelligence, int agility, int spirit){
        super(weaponType);
        this.specification=specification;
        this.damage=damage;
        this.strength=strength;
        this.intelligence=intelligence;
        this.agility=agility;
        this.spirit=spirit;
    }
}
