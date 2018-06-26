package fr.iut.aix;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Personnage {
    private String name;
    private IntegerProperty hp = new SimpleIntegerProperty((int)(80 + Math.random()*40));
    private IntegerProperty force =  new SimpleIntegerProperty(0);
    private IntegerProperty dexterite =  new SimpleIntegerProperty(0);
    private IntegerProperty endurance =  new SimpleIntegerProperty(0);
    private IntegerProperty magie =  new SimpleIntegerProperty(0);
    private IntegerProperty charisme = new SimpleIntegerProperty( 0);
    private Inventaire inventaire = new Inventaire();

    public static Personnage PERSONNAGEDEPART = new Personnage("");

    public Personnage(String name)
    {
        this.name = name;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void setCharisme(int charisme) {
        this.charisme.set(charisme);
    }

    public void setDexterite(int dexterite) {
        this.dexterite.set(dexterite);
    }

    public void setEndurance(int endurance) {
        this.endurance.set(endurance);
    }

    public void setForce(int force) {
        this.force.set(force);
    }

    public void setHp(int hp) {
        this.hp.set(hp);
    }

    public void setMagie(int magie) {
        this.magie.set(magie);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp.get();
    }

    public int getCharisme() {
        return charisme.get();
    }

    public int getDexterite() {
        return dexterite.get();
    }

    public int getEndurance() {
        return endurance.get();
    }

    public int getForce() {
        return force.get();
    }

    public IntegerProperty charismeProperty() {
        return charisme;
    }

    public IntegerProperty dexteriteProperty() {
        return dexterite;
    }

    public IntegerProperty enduranceProperty() {
        return endurance;
    }

    public IntegerProperty forceProperty() {
        return force;
    }

    public IntegerProperty hpProperty() {
        return hp;
    }

    public IntegerProperty magieProperty() {
        return magie;
    }

    public int getMagie() {
        return magie.get();
    }

    public void setName(String name) {
        this.name = name;
    }
}
