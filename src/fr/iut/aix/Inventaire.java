package fr.iut.aix;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;

import java.util.ArrayList;

public class Inventaire {
    public Arme arme = Arme.ARMEERREUR;
    public Armure armure = Armure.ARMURERREUR;
    public ArrayList<Objet> objets = new ArrayList<>();
    public ListProperty<String> objetsNames = new SimpleListProperty<>();


    public Arme getArme() {
        return arme;
    }

    public Armure getArmure() {
        return armure;
    }

    public ArrayList<Objet> getObjets() {
        return objets;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public void setArmure(Armure armure) {
        this.armure = armure;
    }
}
