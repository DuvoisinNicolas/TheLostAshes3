package fr.iut.aix;

public class Ennemi {

    private String name;
    private int hp;
    private Arme arme;
    private int statPrincipale;

    public Ennemi (String name, int hp ,Arme arme, int statPrincipale)
    {
        this.name = name;
        this.hp = hp;
        this.arme = arme;
        this.statPrincipale = statPrincipale;
    }

    public String getName() {
        return name;
    }

    public Arme getArme() {
        return arme;
    }

    public int getStatPrincipale() {
        return statPrincipale;
    }

    public int getHp() {
        return hp;
    }
}
