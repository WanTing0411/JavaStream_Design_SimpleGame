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
    equipItems();

  }

  public List<Ability> getAbilities() {
    return abilities;
  }

  @Override
    public void attack(Player target) {

    }

    @Override
    public void useAbility(Player target) {

    }

    // TODO: Implement part 5.

  // TODO: Implement part 6.

  public static void main(String[] args) {
    List<Ability> abilities = new ArrayList<>();
    List<Armor> armor=new ArrayList<>();
    Ability MA =new Ability("Mage:Max", "Mage",10);
    Armor a1= new Armor("helmet","Mage",1,3,4,3,1);
    Weapon w1 =new Weapon("Sticker","Marge",10,2,2,2,2);
    abilities.add(MA);
    armor.add(a1);
    Mage M1= new Mage("Mage_Max",abilities,armor,w1,"Sticker");
  }
}


