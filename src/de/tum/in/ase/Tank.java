package de.tum.in.ase;

import java.util.List;

public class Tank extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;
    private Armor shield;
    public Tank(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, armor, weapon, weaponType);
        this.abilities = abilities;
        this.shield =shield;
        strength = 15;
        intelligence = 4;
        agility = 6;
        spirit = 2;
        amountOfArmor = 30;
    }

    @Override
    public void attack(Player target) {

    }

    @Override
    public void useAbility(Player target) {

    }

    // TODO: Implement part 5.

    // TODO: Implement part 6.
}
