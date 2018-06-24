package fr.iut.aix;

public class Ennemi {

    private String name;
    private int hp;
    private Arme arme;
    private Stat statPrincipale;
    private int valStatPrincipale;

    public Ennemi (String name, int hp ,Arme arme, Stat statPrincipale , int valStatPrincipale)
    {
        this.name = name;
        this.hp = hp;
        this.arme = arme;
        this.statPrincipale = statPrincipale;
        this.valStatPrincipale = valStatPrincipale;
    }

    public String getName() {
        return name;
    }

    public Arme getArme() {
        return arme;
    }

    public Stat getStatPrincipale() {
        return statPrincipale;
    }

    public int getHp() {
        return hp;
    }

    public int getValStatPrincipale() {
        return valStatPrincipale;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
