package de.tum.in.ase;

public abstract class Item {
  // TODO: Implement part 2.
    protected String specification;
    protected String type;
    protected boolean equipped;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;

    protected Item(String type){
        this.type=type;
        equipped=false;
    }

  public String getSpecification() {
    return specification;
  }

  public String getType() {
    return type;
  }

  public boolean isEquipped() {
    return equipped;
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

  public void setSpecification(String specification) {
    this.specification = specification;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setEquipped(boolean equipped) {
    this.equipped = equipped;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public void setSpirit(int spirit) {
    this.spirit = spirit;
  }
}
