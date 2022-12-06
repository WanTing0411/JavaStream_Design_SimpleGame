package de.tum.in.ase;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class Mage extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, armor, weapon, weaponType);
        specification="Mage";
        this.abilities = abilities;
        strength = 2;
        intelligence = 10;
        agility = 4;
        spirit = 6;
        amountOfArmor = 5;

    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void attack(Player target) {
        double Damage = getStrength() * 0.4 + weapon.getDamage() + getAgility() * 0.4 - target.amountOfArmor;
        if(Damage<0){
            System.out.println("You don't have a weapon to attack!");
            System.out.println("Target "+target.getName()+" didn't receive any damage!");
        } else if (target.getHealth() -Damage <= 0) {
            System.out.println(this.getName() + " killed " + target.getName());
            level++;
        }
    }

    @Override
    public void useAbility(Player target) {
        int random=(int)(Math.random()*this.getAbilities().size());
        if(this.getAbilities().get(random).getSpecification()!=target.getSpecification()){
            System.out.println(getName()+" has no spells to cast!");
            System.out.println("Target "+target.getName()+" didn't receive any damage!");
        } else{
            double Damage=getIntelligence()+this.getAbilities().get(random).getDamage()+getSpirit()*0.5-target.getAmountOfArmor();
            if(Damage<0){
                System.out.println("Target "+target.getName()+" didn't receive any damage!");
            }else if(target.getHealth()-Damage<=0){
                System.out.println(this.getName() + " killed " + target.getName());
                level++;
            }
        }
    }

    // TODO: Implement part 5.

    // TODO: Implement part 6.

}


