package de.tum.in.ase;

import java.lang.reflect.AnnotatedArrayType;

public class Ability {
  // TODO: Implement part 1.
    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;

    public Ability(String name, String specification,int amount){
        this.name=name;
        this.specification=specification;
        if(this.specification=="Mange"){
            damage=amount;
            heal=-1;
            armor=-1;
        }else if(this.specification=="Tank"){
            armor=amount;
            damage=-1;
            heal=-1;
        }else if(this.specification=="Healer"){
            heal=amount;
            damage=-1;
            armor=-1;
        }else if(this.specification=="Warrior"){
            damage=amount;
            heal=-1;
            armor=1;
        }else if(this.specification==""){
            damage=-1;
            heal=-1;
            armor=-1;
        }

    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public int getDamage() {
        return damage;
    }

    public int getHeal() {
        return heal;
    }

    public int getArmor() {
        return armor;
    }

    public static void main(String[] args) {
        Ability a1= new Ability("Max","Tank",20);
    }
}
