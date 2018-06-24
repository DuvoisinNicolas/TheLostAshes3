package fr.iut.aix;

public class Arme {
    private int maxDamage;
    private int bonusPrecision;
    private String name;

    public Arme (String name , int maxDamage , int bonusPrecision)
    {
        this.name = name;
        this.maxDamage = maxDamage;
        this.bonusPrecision = bonusPrecision;
    }

    public String getName() {
        return name;
    }

    public int getBonusPrecision() {
        return bonusPrecision;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
