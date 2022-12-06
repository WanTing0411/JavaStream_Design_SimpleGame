package de.tum.in.ase;

import java.util.List;

public class Warrior extends Player {
    // TODO: Implement part 4.
    private List<Ability> abilities;

    public Warrior(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, armor, weapon, weaponType);
        specification="Warrior";
        this.abilities = abilities;
        strength = 20;
        intelligence = 2;
        agility = 8;
        spirit = 2;
        amountOfArmor = 15;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public void attack(Player target) {
        double Damage = getStrength() * 0.1 + weapon.getDamage() + getAgility() * 0.8 - target.amountOfArmor;
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
            System.out.println(getName()+" has no skills to use!");
            System.out.println("Target "+target.getName()+" didn't receive any damage!");
        } else{
            double Damage=getStrength()*2+this.getAbilities().get(random).getDamage()-target.getAmountOfArmor();
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
