package de.tum.in.ase;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class Mage extends Player{
  // TODO: Implement part 4.
    private List<Ability> abilities;

  public Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
    super(name,armor,weapon,weaponType);
    this.abilities=abilities;
    strength=2;
    intelligence=10;
    agility=4;
    spirit=6;
    amountOfArmor=5;
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
