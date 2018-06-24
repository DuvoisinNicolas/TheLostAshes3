package fr.iut.aix;

public class Map {
    private String name;
    private String text;
    private String button1 = "";
    private String map1;
    private String button2 = "";
    private String map2;
    private String button3 = "";
    private String map3;
    private String button4 = "";
    private String map4;
    private Ennemi ennemi;


    //Maps normales
    public Map (String name , String text , String button1 , String map1)
    {
        oneButton(name, text, button1, map1);
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2)
    {
        twoButtons(name, text, button1 , map1, button2, map2);
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3)
    {
        threeButtons(name, text, button1, map1, button2, map2, button3, map3);
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4)
    {
        fourButtons(name, text, button1, map1, button2, map2, button3, map3, button4, map4);
    }





    // Maps à objet
    public Map (String name , String text , String button1 , String map1, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        oneButton(name, text, button1,map1);
        ajouterRetirerObjet(objet, typeInteractionObjet);
    }


    public Map (String name , String text , String button1 , String map1, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {

        oneButton(name, text, button1 , map1);
        verifierObjetNecessaire(objet, typeInteractionObjet, numeroBouton);

    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        twoButtons(name, text, button1,map1,button2,map2);
        ajouterRetirerObjet(objet, typeInteractionObjet);
    }


    public Map (String name , String text , String button1 , String map1, String button2, String map2, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        twoButtons(name, text, button1,map1,button2,map2);
        verifierObjetNecessaire(objet, typeInteractionObjet, numeroBouton);
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        threeButtons(name, text, button1,map1,button2,map2,button3,map3);
        ajouterRetirerObjet(objet, typeInteractionObjet);
    }


    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        threeButtons(name, text, button1,map1,button2,map2,button3,map3);
        verifierObjetNecessaire(objet, typeInteractionObjet, numeroBouton);
    }


    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        fourButtons(name, text, button1,map1,button2,map2,button3,map3,button4,map4);
        ajouterRetirerObjet(objet, typeInteractionObjet);
    }


    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        fourButtons(name, text, button1,map1,button2,map2,button3,map3,button4,map4);
        verifierObjetNecessaire(objet, typeInteractionObjet, numeroBouton);
    }


    //Map a modification de stat
    public Map (String name , String text , String button1 , String map1, Stat s , int valeur)
    {
        oneButton(name, text, button1,map1);
        calculerStats(s, valeur);
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , Stat s , int valeur)
    {
        twoButtons(name, text, button1,map1, button2,map2);
        calculerStats(s, valeur);
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Stat s , int valeur)
    {
        threeButtons(name, text, button1,map1, button2,map2, button3,map3);
        calculerStats(s, valeur);
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4  , Stat s , int valeur)
    {
        fourButtons(name, text, button1,map1, button2,map2, button3,map3, button4,map4);
        calculerStats(s, valeur);
    }


    //Map à ennemi
    public Map (String name , String text , String button1 , String map1, Ennemi ennemi)
    {
        oneButton(name, text, button1, map1);
        this.ennemi = ennemi;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2, Ennemi ennemi)
    {
        twoButtons(name, text, button1,map1, button2,map2);
        this.ennemi = ennemi;
    }

    public Map (String name , String text , String button1 , String button2 , String button3, Ennemi ennemi)
    {
        threeButtons(name, text, button1,map1, button2,map2, button3,map3);
        this.ennemi = ennemi;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4, Ennemi ennemi)
    {
        fourButtons(name, text, button1,map1, button2,map2, button3,map3, button4,map4);
        this.ennemi = ennemi;
    }
    private void oneButton(String name, String text, String button1 , String map1) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.map1 = map1;
    }

    private void twoButtons(String name, String text, String button1, String map1, String button2, String map2) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.button2 = button2;
        this.map1 = map1;
        this.map2 = map2;
    }

    private void threeButtons(String name, String text, String button1, String map1, String button2, String map2, String button3, String map3) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.map1 = map1;
        this.map2 = map2;
        this.map3 = map3;
    }

    private void fourButtons(String name, String text, String button1, String map1, String button2, String map2, String button3, String map3, String button4, String map4) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.map1 = map1;
        this.map2 = map2;
        this.map3 = map3;
        this.map4 = map4;
    }

    private void ajouterRetirerObjet(Objet objet, TypeInteractionObjet typeInteractionObjet) {
        if (typeInteractionObjet.equals(TypeInteractionObjet.PERDRE))
        {
            if (Main.p.getInventaire().getObjets().contains(objet))
                Main.p.getInventaire().getObjets().remove(objet);
        }
        if (typeInteractionObjet.equals(TypeInteractionObjet.TROUVER))
        {
            Main.p.getInventaire().getObjets().add(objet);
        }
    }

    private void verifierObjetNecessaire(Objet objet, TypeInteractionObjet typeInteractionObjet, int numeroBouton) {
        if (typeInteractionObjet.equals(TypeInteractionObjet.NECESSAIRE))
        {
            if (!Main.p.getInventaire().getObjets().contains(objet))
            {
                switch (numeroBouton)
                {
                    case 1:
                        this.button1 = "";
                        break;
                    case 2:
                        this.button2 = "";
                        break;
                    case 3:
                        this.button3 = "";
                        break;
                    case 4:
                        this.button4 = "";
                        break;}
            }
        }
    }

    private void calculerStats(Stat s, int valeur) {
        if (s.equals(Stat.HP))
            Main.p.setHp(Main.p.getHp()+valeur);
        if (s.equals(Stat.FORCE))
            Main.p.setForce(Main.p.getForce()+valeur);
        if (s.equals(Stat.DEXTERITE))
            Main.p.setHp(Main.p.getDexterite()+valeur);
        if (s.equals(Stat.ENDURANCE))
            Main.p.setHp(Main.p.getEndurance()+valeur);
        if (s.equals(Stat.MAGIE))
            Main.p.setHp(Main.p.getMagie()+valeur);
        if (s.equals(Stat.CHARISME))
            Main.p.setHp(Main.p.getCharisme()+valeur);
    }
}
