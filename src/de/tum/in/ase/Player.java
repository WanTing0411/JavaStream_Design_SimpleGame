package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public abstract class Player implements Interactions {
    // TODO: Add missing attributes.
    protected Weapon weapon;
    protected List<Armor> armor;

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

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.armor = armor;
        this.weapon = weapon;
        this.weaponType = weaponType;
        level=1;
        health = 200;
        equipItems();
    }

    protected Player(String name, List<Armor> armor, Weapon weapon, String weaponType) { //for each specification
        this.weapon = weapon;
        this.armor = armor;
        this.name = name;
        this.weaponType = weaponType;
        health = 200;
        level=1;
        equipItems();
    }

    //tank need to derease shield
    protected boolean isDead() {
        return false;
    }

    private void HelpsumSkill() {
        for (int i = 0; i < getArmor().size(); i++) {

        }
    }

    protected void equipItems() {
        if (getWeaponType() == weapon.getType()) {
            weapon.setEquipped(true);
            strength = getStrength() + weapon.getStrength();
            intelligence = getIntelligence() + weapon.getIntelligence();
            agility = getAgility() + weapon.getAgility();
            spirit = getSpirit() + weapon.getSpirit();
        }

        if (getArmor() != null) {
            for (int i = 0; i < getArmor().size(); i++) {
                if (getArmor().get(i) != null) {
                    switch (getArmor().get(i).getType()) {
                        case "Helmet":
                            if (helmet == null) {
                                helmet = getArmor().get(i);
                                amountOfArmor=getArmor().get(i).getAmountOfArmor();
                                strength = getStrength() + getArmor().get(i).getStrength();
                                intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                                agility = getAgility() + getArmor().get(i).getAgility();
                                spirit = getSpirit() + getArmor().get(i).getSpirit();
                            }
                            break;
                        case "Chest":
                            if (chest == null) {
                                chest = getArmor().get(i);
                                amountOfArmor+=getArmor().get(i).getAmountOfArmor();
                                strength = getStrength() + getArmor().get(i).getStrength();
                                intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                                agility = getAgility() + getArmor().get(i).getAgility();
                                spirit = getSpirit() + getArmor().get(i).getSpirit();
                            }
                            break;
                        case "Hands":
                            if (hands == null) {
                                hands = getArmor().get(i);
                                amountOfArmor+=getArmor().get(i).getAmountOfArmor();
                                strength = getStrength() + getArmor().get(i).getStrength();
                                intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                                agility = getAgility() + getArmor().get(i).getAgility();
                                spirit = getSpirit() + getArmor().get(i).getSpirit();
                            }
                            break;
                        case "Legs":
                            if (legs == null) {
                                legs = getArmor().get(i);
                                amountOfArmor+=getArmor().get(i).getAmountOfArmor();
                                strength = getStrength() + getArmor().get(i).getStrength();
                                intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                                agility = getAgility() + getArmor().get(i).getAgility();
                                spirit = getSpirit() + getArmor().get(i).getSpirit();
                            }
                            break;
                        case "Boots":
                            if (boots == null) {
                                boots = getArmor().get(i);
                                amountOfArmor++;
                                strength = getStrength() + getArmor().get(i).getStrength();
                                intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                                agility = getAgility() + getArmor().get(i).getAgility();
                                spirit = getSpirit() + getArmor().get(i).getSpirit();
                            }
                            break;
                        case "Shield":
                            amountOfArmor++;
                            strength = getStrength() + getArmor().get(i).getStrength();
                            intelligence = getIntelligence() + getArmor().get(i).getIntelligence();
                            agility = getAgility() + getArmor().get(i).getAgility();
                            spirit = getSpirit() + getArmor().get(i).getSpirit();
                            break;
                    }

                }
            }
        }


    }


    // TODO: Implement part 3.


    public Weapon getWeapon() {
        return weapon;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public int getAmountOfArmor() {
        return amountOfArmor;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpirit() {
        return spirit;
    }

    public double getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public Armor getHelmet() {
        return helmet;
    }

    public Armor getChest() {
        return chest;
    }

    public Armor getHands() {
        return hands;
    }

    public Armor getLegs() {
        return legs;
    }

    public Armor getBoots() {
        return boots;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
