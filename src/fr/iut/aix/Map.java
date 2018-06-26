package fr.iut.aix;

import java.util.ArrayList;

public class Map {
    public static ArrayList<Map> tabMaps = new ArrayList<>();
    public static Map ERREUR = new Map ("ERREUR","ERREUR","ERREUR");
    public static Map DEBUT = new Map("Bienvenue (Checkpoint)","Vous gagnez 10 points d'endurance !!!!  (C'est juste pour les tests hein). Aller au combat ?","Oui !","Combat",Stat.ENDURANCE,10);
    public static Map MAP1 = new Map("Combat" ,"","Continuer" , "Objet" , new Ennemi("Gilbert" , 5 , Arme.ARMEDEBUT2,Stat.ENDURANCE,2));
    public static Map MAP2 = new Map ("Objet","Vous ramassez un objet incroyable ! Un slip sale !" ,"D'accord !","TestStat",Objet.SLIPSALE,TypeInteractionObjet.TROUVER);
    public static Map MAP3 = new Map ("TestStat","Ici on teste ta stat. C'est un test de force , donc vu que tu en as 10 , tu devrais forcément réussir . Si tu vas vers la map \"Bienvenue\" , c'est buggé !","Ca marche alors !","TestObjet","Bienvenue (Checkpoint)",Stat.ENDURANCE);
    public static Map MAP4 = new Map("TestObjet","Ici on teste si tu as bien ramassé le slip sale . Tu devrais pouvoir aller dans les 2 boutons si tout va bien !","Retourner au début","Bienvenue","Continuer avec le slip et mourrir","Mort",Objet.SLIPSALE,TypeInteractionObjet.NECESSAIRE,2);
    public static Map MAP5 = new Map("Mort","","RIP !","Victoire",new Ennemi("Dieu",500,new Arme("LA MORT",1000,500),Stat.FORCE,1000));
    public static Map DEFAITE = new Map("Défaite","Défaite ! Vos HP ont atteint 0 ...","Charger le point de sauvegarde","","Rejouer","");
    public static Map VICTOIRE = new Map("Victoire","Victoire ! Vous avez réussi !","Rejouer","");


    private String name;
    private String text;
    private String button1 = "";
    private String map1 = "";
    private String button2 = "";
    private String map2 = "";
    private String button3 = "";
    private String map3 = "";
    private String button4 = "";
    private String map4 = "";
    private Ennemi ennemi = Ennemi.ERREUR;
    private Objet objet = Objet.ERREUR;
    private TypeInteractionObjet typeInteractionObjet = TypeInteractionObjet.ERREUR;
    private Stat stat = Stat.ERREUR;
    private int valStat = 0;
    private int numeroBouton = 0;
    private boolean checkpoint = false;

    //Defaite/victoire
    private Map (String name , String text , String button1)
    {
        tabMaps.add(this);
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
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
    }

    public Map (String name , String text , String button1 , String map1, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {

        oneButton(name, text, button1 , map1);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
        this.numeroBouton = numeroBouton;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        twoButtons(name, text, button1,map1,button2,map2);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        twoButtons(name, text, button1,map1,button2,map2);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
        this.numeroBouton = numeroBouton;
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        threeButtons(name, text, button1,map1,button2,map2,button3,map3);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        threeButtons(name, text, button1,map1,button2,map2,button3,map3);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
        this.numeroBouton = numeroBouton;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4, Objet objet , TypeInteractionObjet typeInteractionObjet)
    {
        fourButtons(name, text, button1,map1,button2,map2,button3,map3,button4,map4);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4, Objet objet , TypeInteractionObjet typeInteractionObjet , int numeroBouton)
    {
        fourButtons(name, text, button1,map1,button2,map2,button3,map3,button4,map4);
        this.objet = objet;
        this.typeInteractionObjet = typeInteractionObjet;
        this.numeroBouton = numeroBouton;
        }


    //Map a modification de stat
    public Map (String name , String text , String button1 , String map1, Stat s , int valeur)
    {
        oneButton(name, text, button1,map1);
        this.stat = s;
        this.valStat = valeur;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , Stat s , int valeur)
    {
        twoButtons(name, text, button1,map1, button2,map2);
        this.stat = s;
        this.valStat = valeur;
    }

    public Map (String name , String text , String button1 , String map1 , String button2, String map2 , String button3, String map3, Stat s , int valeur)
    {
        threeButtons(name, text, button1,map1, button2,map2, button3,map3);
        this.stat = s;
        this.valStat = valeur;
    }

    public Map (String name , String text , String button1 , String map1, String button2, String map2 , String button3 , String map3, String button4, String map4  , Stat s , int valeur)
    {
        fourButtons(name, text, button1,map1, button2,map2, button3,map3, button4,map4);
        this.stat = s;
        this.valStat = valeur;
    }


    //Map à ennemi
    public Map (String name , String text , String button1 , String map1 , Ennemi ennemi)
    {
        tabMaps.add(this);
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.ennemi = ennemi;
        this.map1 = map1;
    }

    //Test de stat
    public Map (String name , String text , String button1 , String map1 , String map2 , Stat s)
    {
        tabMaps.add(this);
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.stat = s;
        this.map1 = map1;
        this.map2 = map2;
    }


    private void checkCheckpoint ()
    {
        if (this.name.contains("(Checkpoint)"))
            this.checkpoint = true;
    }


    private void oneButton(String name, String text, String button1 , String map1) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.map1 = map1;
        tabMaps.add(this);
    }

    private void twoButtons(String name, String text, String button1, String map1, String button2, String map2) {
        this.name = name;
        this.text = text;
        this.button1 = button1;
        this.button2 = button2;
        this.map1 = map1;
        this.map2 = map2;
        tabMaps.add(this);
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
        tabMaps.add(this);
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
        tabMaps.add(this);
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

    public int getValStat() {
        return valStat;
    }

    public Objet getObjet() {
        return objet;
    }

    public Stat getStat() {
        return stat;
    }

    public TypeInteractionObjet getTypeInteractionObjet() {
        return typeInteractionObjet;
    }

    public void setButton1(String button1) {
        this.button1 = button1;
    }

    public void setButton2(String button2) {
        this.button2 = button2;
    }

    public void setButton3(String button3) {
        this.button3 = button3;
    }

    public void setButton4(String button4) {
        this.button4 = button4;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumeroBouton() {
        return numeroBouton;
    }

    public void setMap1(String map1) {
        this.map1 = map1;
    }

    public void setMap2(String map2) {
        this.map2 = map2;
    }

    public void setMap3(String map3) {
        this.map3 = map3;
    }

    public void setMap4(String map4) {
        this.map4 = map4;
    }

    public boolean isCheckpoint() {
        if (this.name.contains("(Checkpoint)"))
            return true;
        else
            return false;
    }
}
