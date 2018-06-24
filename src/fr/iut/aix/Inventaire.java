package fr.iut.aix;

import java.util.ArrayList;

public class Inventaire {
    public Arme arme;
    public Armure armure;
    public ArrayList<Objet> objets = new ArrayList<>();

    public Arme getArme() {
        return arme;
    }

    public Armure getArmure() {
        return armure;
    }

    public ArrayList<Objet> getObjets() {
        return objets;
    }
}
