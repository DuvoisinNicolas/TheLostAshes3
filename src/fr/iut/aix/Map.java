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

    public static Map DEBUT = new Map("Bienvenue" ,"","Continuer" , "Rien" , new Ennemi("Gilbert" , 5 , Arme.ARMEDEBUT2,Stat.FORCE,10));
    public static Map DEFAITE = new Map("Défaite","Défaite ! Vos HP ont atteint 0 ...","Rejouer");
    public static Map VICTOIRE = new Map("Victoire","Victoire ! Vous avez réussi !","Rejouer");

    //Defaite/victoire
    private Map (String name , String text , String button1)
    {
        this.name = name;
        this.text = text;
        this.button1 = button1;
    }

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
    public Map (String name , String text , String button1 , String map1 , Ennemi ennemi)
    {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.ennemi = ennemi;
        if (combat(ennemi))
            this.map1 = map1;
        else this.map1 = "Défaite";
    }

    //Test de stat
    public Map (String name , String text , String button1 , String map1 , String map2 , Stat s)
    {
        this.name = name;
        this.text = text;
        this.button1 = button1;

        if (s.equals(Stat.HP) && Main.p.getHp() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

        if (s.equals(Stat.FORCE) && Main.p.getForce() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

        if (s.equals(Stat.DEXTERITE) && Main.p.getDexterite() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

        if (s.equals(Stat.ENDURANCE) && Main.p.getEndurance() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

        if (s.equals(Stat.MAGIE) && Main.p.getMagie() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

        if (s.equals(Stat.CHARISME) && Main.p.getCharisme() >= Math.random()*100)
            this.map1 = map1;
        else this.map1 = map2;

    }


    private boolean combat (Ennemi ennemi)
    {
        text = text + "L'ennemi possède " + ennemi.getHp() + " HP . \n\n";
        if (ennemi.getStatPrincipale().equals(Stat.FORCE))
        text = text + "Il s'agit d'un combat de Force ! \n\n";
        if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            text = text + "Il s'agit d'un combat de Dextérité ! \n\n";
        if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            text = text + "Il s'agit d'un combat de Magie ! \n\n";
        if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            text = text + "Il s'agit d'un combat d'Endurance ! \n\n";


        while (Main.p.getHp() > 0 && ennemi.getHp() > 0)
        {
            int de = (int)(Math.random()*5)+1;
            int deEnnemi = (int)(Math.random()*5)+1;
            if (ennemi.getStatPrincipale().equals(Stat.FORCE))
            {
                int valAtk = Main.p.getForce() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(ennemi, de, deEnnemi, valAtk);
            }
            if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            {
                int valAtk = Main.p.getDexterite() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(ennemi,de,deEnnemi,valAtk);

            }
            if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            {
                int valAtk = Main.p.getEndurance() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(ennemi,de,deEnnemi,valAtk);
            }
            if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            {
                int valAtk = Main.p.getMagie() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(ennemi,de,deEnnemi,valAtk);
            }

            text = text + "Vous possèdez donc " + Main.p.getHp() + " HP. \n";
            text = text + "L'ennemi possède maintenant " + ennemi.getHp() + " HP . \n";

            if (!(Main.p.getHp() > 0))
            {
                text = text + "Vous avez perdu !!! Vos HP ont atteint 0 ...";
            }
            if (!(ennemi.getHp() > 0))
            {
                text = text + "Vous avez eu raison de l'ennemi ! Bravo !";
            }
        }

        return !(Main.p.getHp() < 0);
    }

    private void calculerCombat(Ennemi ennemi, int de, int deEnnemi, int valAtk) {
        int valAtkEnnemi = ennemi.getValStatPrincipale() + deEnnemi;
        text = text + "Votre jet de dé est " + de + " , et celui de l'ennemi est de " + deEnnemi + " .\n";
        if (ennemi.getStatPrincipale().equals(Stat.FORCE))
            text = text + "On y ajoute votre valeur de Force à votre jet ( " + Main.p.getForce() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet ( " + ennemi.getValStatPrincipale() + " ).\n";
        if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            text = text + "On y ajoute votre valeur de Dextérité : ( " + Main.p.getDexterite() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n";
        if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            text = text + "On y ajoute votre valeur de Magie : ( " + Main.p.getMagie() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n";
        if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            text = text + "On y ajoute votre valeur d'Endurance : ( " + Main.p.getEndurance() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n";

        if ( Main.p.getInventaire().getArme().getBonusPrecision() != 0)
            text = text + "Votre arme vous ajoute un modificateur de précision de " + Main.p.getInventaire().getArme().getBonusPrecision() + "\n";
        text = text + "Votre précision est donc de " + valAtk + ", et celle de l'ennemi est de " + valAtkEnnemi + ". \n";
        if (valAtk > valAtkEnnemi)
        {
            int degAtk = (int) (Math.random() * Main.p.getInventaire().getArme().getMaxDamage());
            text = text + "C'est donc à vous d'attaquer ! Vous infligez " + degAtk + " points de dégats à l'ennemi. \n";
            ennemi.setHp(ennemi.getHp()-degAtk);
        }
        else if (valAtk < valAtkEnnemi)
        {
            int degAtk = (int) (Math.random() * ennemi.getArme().getMaxDamage());
            text = text + "C'est l'ennemi qui vous attaque ! Il vous inflige " + degAtk + " points de dégats. \n";
            if (!Main.p.getInventaire().getArmure().equals(Armure.ARMURERREUR)) {
                text = text + "Ces dégats sont réduits de " + Main.p.getInventaire().getArmure().getReducDegats() + " points grâce à votre " +
                        Main.p.getInventaire().getArmure().getName() + " ! \n";
            }
            Main.p.setHp(Main.p.getHp()-(degAtk-Main.p.getInventaire().getArmure().getReducDegats()));
        }
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

        if (Main.p.getForce() > 10)
            Main.p.setForce(10);
        if (Main.p.getDexterite() > 10)
            Main.p.setDexterite(10);
        if (Main.p.getEndurance() > 10)
            Main.p.setEndurance(10);
        if (Main.p.getMagie() > 10)
            Main.p.setMagie(10);
        if (Main.p.getCharisme() > 10)
            Main.p.setCharisme(10);

        if (Main.p.getHp() < 0)
            Main.p.setHp(0);
        if (Main.p.getForce() < 0)
            Main.p.setForce(0);
        if (Main.p.getDexterite() < 0)
            Main.p.setDexterite(0);
        if (Main.p.getEndurance() < 0)
            Main.p.setEndurance(0);
        if (Main.p.getMagie() < 0)
            Main.p.setMagie(0);
        if (Main.p.getCharisme() < 0)
            Main.p.setCharisme(0);

    }

    public String getName() {
        return name;
    }

    public Ennemi getEnnemi() {
        return ennemi;
    }

    public String getButton1() {
        return button1;
    }

    public String getButton2() {
        return button2;
    }

    public String getButton3() {
        return button3;
    }

    public String getButton4() {
        return button4;
    }

    public String getMap1() {
        return map1;
    }

    public String getMap2() {
        return map2;
    }

    public String getMap3() {
        return map3;
    }

    public String getMap4() {
        return map4;
    }

    public String getText() {
        return text;
    }
}
