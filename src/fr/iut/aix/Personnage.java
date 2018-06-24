package fr.iut.aix;

public class Personnage {
    private String name;
    private int hp = 100;
    private int force = 0;
    private int dexterite = 0;
    private int endurance = 0;
    private int magie = 0;
    private int charisme = 0;
    private Inventaire inventaire = new Inventaire();

    public Personnage(String name)
    {
        this.name = name;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getCharisme() {
        return charisme;
    }

    public int getDexterite() {
        return dexterite;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getForce() {
        return force;
    }

    public int getMagie() {
        return magie;
    }
}
