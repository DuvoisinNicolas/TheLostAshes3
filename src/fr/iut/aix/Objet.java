package fr.iut.aix;

public class Objet {
    private String name;

    public static Objet SLIPSALE = new Objet("Slip sale");
    public static Objet ERREUR = new Objet("");

    public Objet (String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
