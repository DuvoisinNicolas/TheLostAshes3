package fr.iut.aix;

public class Armure {
    private int reducDegats;
    private String name;

    public Armure (String name , int reducDegats)
    {
        this.name = name;
        this.reducDegats = reducDegats;
    }

    public String getName() {
        return name;
    }

    public int getReducDegats() {
        return reducDegats;
    }
}
