package de.tum.in.ase;

import java.util.List;
import java.util.Random;

public class Healer extends Player {
  // TODO: Implement part 4.
  private List<Ability> abilities;

    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType){
        super(name,armor,weapon,weaponType);
        specification="Healer";
        this.abilities=abilities;
        strength=3;
        intelligence=5;
        agility=6;
        spirit=2;
        amountOfArmor=30;
    }
//tank equipped decrease isSheild
    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void attack(Player target) {
        if(getWeaponType() != weapon.getType()){
            System.out.println("You don't have a weapon to attack!");
        }else{
            double Damage = getStrength() * 0.2 + weapon.getDamage() + getAgility() * 0.1 - target.amountOfArmor;
            if(Damage<0){
                System.out.println("Target "+target.getName()+" didn't receive any damage!");
            } else if (target.getHealth() -Damage <= 0) {
                System.out.println(this.getName() + " killed " + target.getName());
                setHealth(0);
                level++;
            }else{
                setHealth(target.getHealth() -Damage);
            }
        }
    }

    @Override
    public void useAbility(Player target) {
        int random=(int)(Math.random()*this.getAbilities().size());
        if(this.getAbilities().get(random).getSpecification()!=target.getSpecification()){
            System.out.println(getName()+" has no spells to cast!");
        } else{
            if(target.getHealth()<=0){
                System.out.println("Can not heal "+target.getName()+", "+target.getName()+"+ is dead!");
            }else{
                double Damage=getSpirit()+this.getAbilities().get(random).getHeal()+getIntelligence()*0.5;
                double addHealth=target.getHealth()+Damage;
                target.setHealth(addHealth);
            }
        }
    }

    // TODO: Implement part 5.

  // TODO: Implement part 6.
}
