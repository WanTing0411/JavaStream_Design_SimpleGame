package de.tum.in.ase;

import java.util.List;

public class Healer extends Player {
  // TODO: Implement part 4.
  private List<Ability> abilities;

    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
        super(name,armor,weapon,weaponType);
        this.abilities=abilities;
        strength=3;
        intelligence=5;
        agility=6;
        spirit=2;
        amountOfArmor=30;
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
