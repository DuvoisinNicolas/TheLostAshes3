package fr.iut.aix;

public class Arme {
    private int maxDamage;
    private int bonusPrecision;
    private String name;

    public static Arme ARMEERREUR = new Arme("Aucune" , 0 , 0);
    public static Arme ARMEDEBUT1 = new Arme("StormRuler" , 4,2);
    public static Arme ARMEDEBUT2 = new Arme("DoomHammer" , 6,1);
    public static Arme ARMEDEBUT3 = new Arme("Excalibur" , 8 , 0);
    public static Arme ARMEDEBUT4 = new Arme("Andurill" , 10 , -2);

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
