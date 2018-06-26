package fr.iut.aix;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.lang.String.valueOf;

public class Main extends Application {
    public static Personnage p = new Personnage("");
    public static int MAXPTSALLOUER = 0;

    public BorderPane root = new BorderPane();
    public Scene scene = new Scene(root);

    //Modifs dans les events
    private IntegerProperty nombreRestant = new SimpleIntegerProperty(MAXPTSALLOUER);
    private Map map1 = Map.ERREUR;
    private Map map2 = Map.ERREUR;
    private Map map3 = Map.ERREUR;
    private Map map4 = Map.ERREUR;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The Lost Ashes 3.2");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("resources/main.css");
        interfaceCreationPerso();
        root.setStyle("-fx-background-color: GREY");
        primaryStage.show();
    }

    public void interfaceCreationPerso()
    {

        VBox center = new VBox();
        center.setSpacing(5);
        center.setAlignment(Pos.CENTER);

        HBox choixDeNom = new HBox();
        choixDeNom.setAlignment(Pos.CENTER);
        Label nameText = new Label("Entrez votre nom :  ");
        TextField nameField = new TextField();
        choixDeNom.getChildren().addAll(nameText,nameField);

        HBox nbRestants = new HBox();
        Label nombreDePointsAAllouer = new Label("Nombre de points restants : ");
        Label nombreDePtsRestants = new Label();
        nombreDePtsRestants.textProperty().bind(nombreRestant.asString());
        nbRestants.setAlignment(Pos.CENTER);
        nbRestants.getChildren().addAll(nombreDePointsAAllouer,nombreDePtsRestants);

        HBox choixDeForce = new HBox();
        choixDeForce.setSpacing(40);
        Button moinsForce = new Button("-");
        Label forceText = new Label("Force");
        Label force = new Label();
        force.textProperty().bind(p.forceProperty().asString());
        Button plusForce = new Button("+");
        moinsForce.setOnAction(event -> {
            if (p.getForce() > 0 && MAXPTSALLOUER > nombreRestant.get())
            {
                p.setForce(p.getForce()-1);
                nombreRestant.set(nombreRestant.get()+1);
            }
        });
        plusForce.setOnAction(event -> {

            if (nombreRestant.get() > 0 && p.getForce() < 10)
            {
                p.setForce(p.getForce() + 1);
                nombreRestant.set(nombreRestant.get()-1);
            }
        });
        choixDeForce.setAlignment(Pos.CENTER);
        choixDeForce.getChildren().addAll(moinsForce,force,plusForce);




        HBox choixDeDexterite = new HBox();
        choixDeDexterite.setSpacing(40);
        Button moinsDexterite = new Button("-");
        Label dexteriteText = new Label("Dextérité");
        Label dexterite = new Label();
        dexterite.textProperty().bind(p.dexteriteProperty().asString());
        Button plusDexterite = new Button("+");
        moinsDexterite.setOnAction(event -> {
            if (p.getDexterite() > 0 && MAXPTSALLOUER > nombreRestant.get())
            {
                p.setDexterite(p.getDexterite()-1);
                nombreRestant.set(nombreRestant.get()+1);
            }
        });
        plusDexterite.setOnAction(event -> {

            if (nombreRestant.get() > 0 && p.getDexterite() < 10)
            {
                p.setDexterite(p.getDexterite() + 1);
                nombreRestant.set(nombreRestant.get()-1);
            }
        });
        choixDeDexterite.setAlignment(Pos.CENTER);
        choixDeDexterite.getChildren().addAll(moinsDexterite,dexterite,plusDexterite);



        HBox choixDeEndurance = new HBox();
        choixDeEndurance.setSpacing(40);
        Button moinsEndurance = new Button("-");
        Label enduranceText = new Label("Endurance");
        Label endurance = new Label();
        endurance.textProperty().bind(p.enduranceProperty().asString());
        Button plusEndurance = new Button("+");
        moinsEndurance.setOnAction(event -> {
            if (p.getEndurance() > 0 && MAXPTSALLOUER > nombreRestant.get())
            {
                p.setEndurance(p.getEndurance()-1);
                nombreRestant.set(nombreRestant.get()+1);
            }
        });
        plusEndurance.setOnAction(event -> {

            if (nombreRestant.get() > 0 && p.getEndurance() < 10)
            {
                p.setEndurance(p.getEndurance() + 1);
                nombreRestant.set(nombreRestant.get()-1);
            }
        });
        choixDeEndurance.setAlignment(Pos.CENTER);
        choixDeEndurance.getChildren().addAll(moinsEndurance,endurance,plusEndurance);


        HBox choixDeMagie = new HBox();
        choixDeMagie.setSpacing(40);
        Button moinsMagie = new Button("-");
        Label magieText = new Label("Magie");
        Label magie = new Label();
        magie.textProperty().bind(p.magieProperty().asString());
        Button plusMagie = new Button("+");
        moinsMagie.setOnAction(event -> {
            if (p.getMagie() > 0 && MAXPTSALLOUER > nombreRestant.get())
            {
                p.setMagie(p.getMagie()-1);
                nombreRestant.set(nombreRestant.get()+1);
            }
        });
        plusMagie.setOnAction(event -> {

            if (nombreRestant.get() > 0 && p.getMagie() < 10)
            {
                p.setMagie(p.getMagie() + 1);
                nombreRestant.set(nombreRestant.get()-1);
            }
        });
        choixDeMagie.setAlignment(Pos.CENTER);
        choixDeMagie.getChildren().addAll(moinsMagie,magie,plusMagie);

        HBox choixDeCharisme = new HBox();
        choixDeCharisme.setSpacing(40);
        Button moinsCharisme = new Button("-");
        Label charismeText = new Label("Charisme");
        Label charisme = new Label();
        charisme.textProperty().bind(p.charismeProperty().asString());
        Button plusCharisme = new Button("+");
        moinsCharisme.setOnAction(event -> {
            if (p.getCharisme() > 0 && MAXPTSALLOUER > nombreRestant.get())
            {
                p.setCharisme(p.getCharisme()-1);
                nombreRestant.set(nombreRestant.get()+1);
            }
        });
        plusCharisme.setOnAction(event -> {
            if (nombreRestant.get() > 0 && p.getCharisme() < 10)
            {
                p.setCharisme(p.getCharisme() + 1);
                nombreRestant.set(nombreRestant.get()-1);
            }
        });
        choixDeCharisme.setAlignment(Pos.CENTER);
        choixDeCharisme.getChildren().addAll(moinsCharisme,charisme,plusCharisme);

        nbRestants.setPadding(new Insets(30,0,0,0));
        forceText.setPadding(new Insets(30,0,0,0));
        dexteriteText.setPadding(new Insets(30,0,0,0));
        magieText.setPadding(new Insets(30,0,0,0));
        enduranceText.setPadding(new Insets(30,0,0,0));
        charismeText.setPadding(new Insets(30,0,0,0));

        HBox stats = new HBox();
        stats.setAlignment(Pos.CENTER);
        stats.setSpacing(100);
        VBox left = new VBox();
        left.setAlignment(Pos.CENTER);
        VBox right = new VBox();
        right.setAlignment(Pos.CENTER);
        stats.getChildren().addAll(left,right);
        left.getChildren().addAll(forceText,choixDeForce,dexteriteText,choixDeDexterite);
        right.getChildren().addAll(enduranceText,choixDeEndurance,magieText,choixDeMagie);
        choixDeCharisme.setPadding(new Insets(0,0,50,0));

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Erreur");
        alert.setHeaderText("Encore des points !");
        alert.setContentText("Il reste des points à allouer :)");
        Button choixArmes = new Button("Suivant");
        choixArmes.setOnAction(event -> {
            if (nombreRestant.get() == 0)
            {
                interfaceChoixArmes();
                p.setName(nameField.getText());
            }
            else
                alert.showAndWait();
        });
        center.getChildren().addAll(choixDeNom,nbRestants,stats,charismeText,choixDeCharisme,choixArmes);
        root.setCenter(center);
    }

    public void interfaceChoixArmes()
    {
        root.getChildren().clear();
        GridPane armes = new GridPane();
        armes.setAlignment(Pos.CENTER);


        Label choixArme = new Label("Choisissez votre arme !");
        armes.add(choixArme,0,0);
        Label degatsBonus = new Label("Dé de dégats");
        armes.add(degatsBonus,1,0);
        Label bonusToucher = new Label("Bonus de toucher");
        armes.add(bonusToucher,2,0);


        Label nomArme1 = new Label(Arme.ARMEDEBUT1.getName());
        armes.add(nomArme1,0,1);
        Label nomArme2 = new Label(Arme.ARMEDEBUT2.getName());
        armes.add(nomArme2,0,2);
        Label nomArme3 = new Label(Arme.ARMEDEBUT3.getName());
        armes.add(nomArme3,0,3);
        Label nomArme4 = new Label(Arme.ARMEDEBUT4.getName());
        armes.add(nomArme4,0,4);


        Label statArme1 = new Label(""+Arme.ARMEDEBUT1.getMaxDamage());
        armes.add(statArme1,1,1);
        Label statArme2 = new Label(""+Arme.ARMEDEBUT2.getMaxDamage());
        armes.add(statArme2,1,2);
        Label statArme3 = new Label(""+Arme.ARMEDEBUT3.getMaxDamage());
        armes.add(statArme3,1,3);
        Label statArme4 = new Label(""+Arme.ARMEDEBUT4.getMaxDamage());
        armes.add(statArme4,1,4);


        Label bonusArme1 = new Label(""+Arme.ARMEDEBUT1.getBonusPrecision());
        armes.add(bonusArme1,2,1);
        Label bonusArme2 = new Label(""+Arme.ARMEDEBUT2.getBonusPrecision());
        armes.add(bonusArme2,2,2);
        Label bonusArme3 = new Label(""+Arme.ARMEDEBUT3.getBonusPrecision());
        armes.add(bonusArme3,2,3);
        Label bonusArme4 = new Label(""+Arme.ARMEDEBUT4.getBonusPrecision());
        armes.add(bonusArme4,2,4);


        CheckBox armeBox1 = new CheckBox();
        armes.add(armeBox1,3,1);
        CheckBox armeBox2 = new CheckBox();
        armes.add(armeBox2,3,2);
        CheckBox armeBox3 = new CheckBox();
        armes.add(armeBox3,3,3);
        CheckBox armeBox4 = new CheckBox();
        armes.add(armeBox4,3,4);

        armeBox1.setOnAction(event -> {
            armeBox2.setSelected(false);
            armeBox3.setSelected(false);
            armeBox4.setSelected(false);
            p.getInventaire().setArme(Arme.ARMEDEBUT1);
            if (!armeBox1.isSelected())
                p.getInventaire().setArme(Arme.ARMEERREUR);
        });
        armeBox2.setOnAction(event -> {
            armeBox1.setSelected(false);
            armeBox3.setSelected(false);
            armeBox4.setSelected(false);
            p.getInventaire().setArme(Arme.ARMEDEBUT2);
            if (!armeBox2.isSelected())
                p.getInventaire().setArme(Arme.ARMEERREUR);
        });
        armeBox3.setOnAction(event -> {
        armeBox1.setSelected(false);
        armeBox2.setSelected(false);
        armeBox4.setSelected(false);
        p.getInventaire().setArme(Arme.ARMEDEBUT3);
        if (!armeBox3.isSelected())
            p.getInventaire().setArme(Arme.ARMEERREUR);
        });
        armeBox4.setOnAction(event -> {
        armeBox1.setSelected(false);
        armeBox2.setSelected(false);
        armeBox3.setSelected(false);
        p.getInventaire().setArme(Arme.ARMEDEBUT4);
        if (!armeBox4.isSelected())
            p.getInventaire().setArme(Arme.ARMEERREUR);
        });


        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Erreur");
        alert.setHeaderText("Vous n'avez pas d'arme !");
        alert.setContentText("Merci de choisir une arme de départ.");
        Button jouer = new Button("C'est parti !");
        jouer.setAlignment(Pos.CENTER);
        jouer.setOnAction(event -> {
            if (!p.getInventaire().getArme().equals(Arme.ARMEERREUR))
            {
                interfaceJeu(Map.DEBUT);
            }
            else alert.showAndWait();

        });
        armes.add(jouer,1,5,2,1);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(20);
        col2.setHalignment(HPos.CENTER);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(20);
        col3.setHalignment(HPos.CENTER);
        ColumnConstraints col4 = new ColumnConstraints();
        col4.setPercentWidth(20);
        col4.setHalignment(HPos.CENTER);
        armes.getColumnConstraints().addAll(col1,col2,col3,col4);


        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(10);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(10);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(10);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(10);
        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(10);
        RowConstraints row6 = new RowConstraints();
        row6.setPercentHeight(10);
        RowConstraints row7 = new RowConstraints();
        row7.setPercentHeight(10);
        armes.getRowConstraints().addAll(row1,row2,row3,row4,row5,row6);


        root.setCenter(armes);

    }

    public void interfaceJeu (Map map)
    {
        root.getChildren().clear();

        StackPane left = buildLeft();
        StackPane right = new StackPane();
        buildRight(right);
        StackPane top = buildTop(map);

        Button choix1;
        Button choix2;
        Button choix3;
        Button choix4;
        //Test de l'objet
        if (!map.getObjet().equals(Objet.ERREUR) && !map.getTypeInteractionObjet().equals(TypeInteractionObjet.ERREUR)) {
            if (map.getTypeInteractionObjet().equals(TypeInteractionObjet.NECESSAIRE)) {
                verifierObjetNecessaire(map, map.getObjet(), map.getTypeInteractionObjet(), map.getNumeroBouton());
            }
            else ajouterRetirerObjet(map.getObjet(), map.getTypeInteractionObjet());
        }

        //Calcul des stats
        if(!map.getStat().equals(Stat.ERREUR) && map.getValStat() != 0)
            calculerStats(map.getStat(),map.getValStat());

        //Calcul du combat
        if(!map.getEnnemi().equals(Ennemi.ERREUR))
        {
            if (!combat(map,map.getEnnemi()))
                map.setMap1("Défaite");
        }

        //Test de stat
        if(!map.getStat().equals(Stat.ERREUR) && map.getValStat() == 0)
        {
            if (map.getStat().equals(Stat.HP) && Main.p.getHp()*10 < Math.random()*100)
                map.setMap1(map.getMap2());

            if (map.getStat().equals(Stat.FORCE) && Main.p.getForce()*10 < Math.random()*100)
                map.setMap1(map.getMap2());

            if (map.getStat().equals(Stat.DEXTERITE) && Main.p.getDexterite()*10 < Math.random()*100)
                map.setMap1(map.getMap2());

            if (map.getStat().equals(Stat.ENDURANCE) && Main.p.getEndurance()*10 < Math.random()*100)
                map.setMap1(map.getMap2());

            if (map.getStat().equals(Stat.MAGIE) && Main.p.getMagie()*10 < Math.random()*100)
                map.setMap1(map.getMap2());

            if (map.getStat().equals(Stat.CHARISME) && Main.p.getCharisme()*10 < Math.random()*100)
                map.setMap1(map.getMap2());
        }




        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHalignment(HPos.CENTER);
        col1.setPercentWidth(45);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHalignment(HPos.CENTER);
        col2.setPercentWidth(45);

        RowConstraints row1 = new RowConstraints();
        row1.setValignment(VPos.CENTER);
        row1.setPercentHeight(80);
        RowConstraints row2 = new RowConstraints();
        row2.setValignment(VPos.CENTER);
        row2.setPercentHeight(10);
        RowConstraints row3 = new RowConstraints();
        row3.setValignment(VPos.CENTER);
        row3.setPercentHeight(10);

        GridPane mid = new GridPane();
        mid.setAlignment(Pos.CENTER);
        mid.getColumnConstraints().addAll(col1,col2);
        mid.getRowConstraints().addAll(row1,row2);

        Text text = new Text(setText(map.getText()));
        text.setStyle("-fx-font-size: 14");


        ScrollPane sp = new ScrollPane();
        sp.setFitToHeight(true);
        sp.setStyle("-fx-background-color: transparent");
        sp.setContent(text);

        mid.add(sp,0,0,2,1);
        choix1 = new Button(map.getButton1());
        mid.add(choix1,0,1);
        choix2 = new Button(map.getButton2());
        mid.add(choix2,1,1);
        choix3 = new Button(map.getButton3());
        mid.add(choix3,0,2);
        choix4 = new Button(map.getButton4());
        mid.add(choix4,1,2);

        if (choix1.getText().equals(""))
            choix1.setVisible(false);
        if (choix2.getText().equals(""))
            choix2.setVisible(false);
        if (choix3.getText().equals(""))
            choix3.setVisible(false);
        if (choix4.getText().equals(""))
            choix4.setVisible(false);


        for (Map m : Map.tabMaps)
        {
            if (map.getMap1().equals(m.getName()))
                map1 = m;
            if (map.getMap2().equals(m.getName()))
                map2 = m;
            if (map.getMap3().equals(m.getName()))
                map3 = m;
            if (map.getMap4().equals(m.getName()))
                map4 = m;
        }

        choix1.setOnAction(event -> {
            System.out.println(map1.getName());
            interfaceJeu(map1);
        });

        choix2.setOnAction(event -> {
            System.out.println(map2.getName());
            interfaceJeu(map2);
        });

        choix3.setOnAction(event -> {
            System.out.println(map3.getName());
            interfaceJeu(map3);
        });

        choix4.setOnAction(event -> {
            System.out.println(map4.getName());
            interfaceJeu(map4);
        });

        root.setCenter(mid);
        root.setLeft(left);
        root.setRight(right);
        root.setTop(top);
    }

    private StackPane buildTop(Map map) {
        StackPane top = new StackPane();
        Label nomMap = new Label(map.getName());
        nomMap.setAlignment(Pos.CENTER);
        nomMap.setStyle("-fx-font-size: 24");
        top.relocate(scene.getWidth()/2,0);
        top.getChildren().add(nomMap);
        return top;
    }

    private void buildRight(StackPane right) {
        VBox inventaireBox = new VBox();
        inventaireBox.setAlignment(Pos.CENTER);

        Rectangle rightRect = new Rectangle(100,530);
        rightRect.setArcHeight(20);
        rightRect.setArcWidth(20);
        rightRect.setFill(Color.TRANSPARENT);
        rightRect.setStroke(Color.BLACK);
        Label arme = new Label("Arme :");
        Label nomArme = new Label(p.getInventaire().getArme().getName());
        Label statsArme = new Label("(" + p.getInventaire().getArme().getMaxDamage() + '/' + p.getInventaire().getArme().getBonusPrecision() + ')');
        statsArme.setPadding(new Insets(0,0,50,0));

        Label armure = new Label("Armure :");
        Label nomArmure = new Label(p.getInventaire().getArmure().getName());
        Label statsArmure = new Label("(" + p.getInventaire().getArmure().getReducDegats() + ')');
        statsArmure.setPadding(new Insets(0,0,50,0));

        Label inventaire = new Label("Objets :");
        Label inventaireItems = new Label("");

        for (Objet o : p.getInventaire().getObjets())
        {
            inventaireItems.setText(inventaireItems.getText() + o.getName() + "\n");
        }

        inventaireBox.getChildren().addAll(arme,nomArme,statsArme,armure,nomArmure,statsArmure,inventaire,inventaireItems);
        right.getChildren().addAll(rightRect,inventaireBox);
    }

    private StackPane buildLeft() {
        StackPane left = new StackPane();
        Rectangle leftRect = new Rectangle(100,530);
        leftRect.setArcHeight(20);
        leftRect.setArcWidth(20);
        leftRect.setFill(Color.TRANSPARENT);
        leftRect.setStroke(Color.BLACK);

        VBox stats = new VBox();
        stats.setAlignment(Pos.CENTER);
        stats.setSpacing(20);

        HBox nomBox = new HBox();
        HBox hpBox  = new HBox();
        HBox forceBox  = new HBox();
        HBox dexteriteBox  = new HBox();
        HBox enduranceBox  = new HBox();
        HBox magieBox  = new HBox();
        HBox charismeBox  = new HBox();

        Label nom = new Label("Nom : ");
        Label hp  = new Label("HP : ");
        Label force  = new Label("Force : ");
        Label dexterite  = new Label("Dextérité : ");
        Label endurance  = new Label("Endurance : ");
        Label magie  = new Label("Magie : ");
        Label charisme  = new Label("Charisme : ");

        Label nomVal = new Label(p.getName());
        Label hpVal  = new Label();
        hpVal.textProperty().bind(p.hpProperty().asString());
        Label forceVal  = new Label();
        forceVal.textProperty().bind(p.forceProperty().asString());
        Label dexteriteVal  = new Label();
        dexteriteVal.textProperty().bind(p.dexteriteProperty().asString());
        Label enduranceVal  = new Label();
        enduranceVal.textProperty().bind(p.enduranceProperty().asString());
        Label magieVal  = new Label();
        magieVal.textProperty().bind(p.magieProperty().asString());
        Label charismeVal  = new Label();
        charismeVal.textProperty().bind(p.charismeProperty().asString());

        nomBox.getChildren().addAll(nom,nomVal);
        hpBox.getChildren().addAll(hp, hpVal);
        forceBox.getChildren().addAll(force,forceVal);
        dexteriteBox.getChildren().addAll(dexterite,dexteriteVal);
        enduranceBox.getChildren().addAll(endurance,enduranceVal);
        magieBox.getChildren().addAll(magie,magieVal);
        charismeBox.getChildren().addAll(charisme,charismeVal);

        stats.setPadding(new Insets(0,0,0,10));
        left.getChildren().addAll(stats,leftRect);

        Label spacing = new Label("\n\n\n\n");
        stats.getChildren().addAll(nomBox,hpBox,spacing,forceBox,dexteriteBox,enduranceBox,magieBox,charismeBox);
        return left;
    }

    public static String setText (String texte)
    {
    char[] charArray= texte.toCharArray();
    int charCpt=0;
        for (int i=0 ; i < charArray.length ; ++i)
        {
            if (charArray[i] == '\n')
            {
                charCpt = 0;
            }
            ++charCpt;
            if (charCpt > 50 && charArray[i-1]=='.' && charArray[i]==' ')
            {
                charArray[i] = '\n';
                charCpt = 0;
            }
            if (charArray[i] == ' ' && charCpt >=70)
            {
                charArray[i] = '\n';
                charCpt = 0;
            }
        }
        return valueOf(charArray);
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

    private void verifierObjetNecessaire(Map map , Objet objet, TypeInteractionObjet typeInteractionObjet, int numeroBouton) {
        if (typeInteractionObjet.equals(TypeInteractionObjet.NECESSAIRE))
        {
            if (!Main.p.getInventaire().getObjets().contains(objet))
            {
                switch (numeroBouton)
                {
                    case 1:
                        map.setButton1("");
                        break;
                    case 2:
                        map.setButton2("");
                        break;
                    case 3:
                        map.setButton3("");
                        break;
                    case 4:
                        map.setButton4("");
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

    private boolean combat (Map map ,Ennemi ennemi)
    {
        map.setText(map.getText() + "L'ennemi possède " + ennemi.getHp() + " HP . \n\n");
        if (ennemi.getStatPrincipale().equals(Stat.FORCE))
            map.setText( map.getText() + "Il s'agit d'un combat de Force ! \n\n");
        if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            map.setText( map.getText() + "Il s'agit d'un combat de Dextérité ! \n\n");
        if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            map.setText( map.getText() + "Il s'agit d'un combat de Magie ! \n\n");
        if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            map.setText(map.getText() + "Il s'agit d'un combat d'Endurance ! \n\n");


        while (Main.p.getHp() > 0 && ennemi.getHp() > 0)
        {
            int de = (int)(Math.random()*5)+1;
            int deEnnemi = (int)(Math.random()*5)+1;
            if (ennemi.getStatPrincipale().equals(Stat.FORCE))
            {
                int valAtk = Main.p.getForce() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(map,ennemi, de, deEnnemi, valAtk);
            }
            if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            {
                int valAtk = Main.p.getDexterite() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(map,ennemi,de,deEnnemi,valAtk);

            }
            if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            {
                int valAtk = Main.p.getEndurance() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(map,ennemi,de,deEnnemi,valAtk);
            }
            if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            {
                int valAtk = Main.p.getMagie() + de + Main.p.getInventaire().getArme().getBonusPrecision();
                calculerCombat(map,ennemi,de,deEnnemi,valAtk);
            }

            map.setText(map.getText() + "Vous possèdez donc " + Main.p.getHp() + " HP. \n");
            map.setText(map.getText() + "L'ennemi possède maintenant " + ennemi.getHp() + " HP . \n");

            if (!(Main.p.getHp() > 0))
            {
                map.setText(map.getText() + "Vous avez perdu !!! Vos HP ont atteint 0 ...");
            }
            if (!(ennemi.getHp() > 0))
            {
                map.setText(map.getText() + "Vous avez eu raison de l'ennemi ! Bravo !");
            }
        }

        return !(Main.p.getHp() <= 0);
    }

    private void calculerCombat(Map map ,Ennemi ennemi, int de, int deEnnemi, int valAtk) {
        int valAtkEnnemi = ennemi.getValStatPrincipale() + deEnnemi;
        map.setText(map.getText() + "Votre jet de dé est " + de + " , et celui de l'ennemi est de " + deEnnemi + " .\n");
        if (ennemi.getStatPrincipale().equals(Stat.FORCE))
            map.setText(map.getText() + "On y ajoute votre valeur de Force à votre jet ( " + Main.p.getForce() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet ( " + ennemi.getValStatPrincipale() + " ).\n");
        if (ennemi.getStatPrincipale().equals(Stat.DEXTERITE))
            map.setText(map.getText() + "On y ajoute votre valeur de Dextérité : ( " + Main.p.getDexterite() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n");
        if (ennemi.getStatPrincipale().equals(Stat.MAGIE))
            map.setText(map.getText() + "On y ajoute votre valeur de Magie : ( " + Main.p.getMagie() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n");
        if (ennemi.getStatPrincipale().equals(Stat.ENDURANCE))
            map.setText(map.getText() + "On y ajoute votre valeur d'Endurance : ( " + Main.p.getEndurance() + " ).\n"
                    + "L'ennemi ajoute également sa valeur à son jet  ( " + ennemi.getValStatPrincipale() + " ).\n");

        if ( Main.p.getInventaire().getArme().getBonusPrecision() != 0)
            map.setText(map.getText() + "Votre arme vous ajoute un modificateur de précision de " + Main.p.getInventaire().getArme().getBonusPrecision() + "\n");
        map.setText(map.getText() + "Votre précision est donc de " + valAtk + ", et celle de l'ennemi est de " + valAtkEnnemi + ". \n");
        if (valAtk > valAtkEnnemi)
        {
            int degAtk = (int) (Math.random() * (Main.p.getInventaire().getArme().getMaxDamage()-1)+1);
            map.setText(map.getText() + "C'est donc à vous d'attaquer ! Vous infligez " + degAtk + " points de dégats à l'ennemi. \n");
            ennemi.setHp(ennemi.getHp()-degAtk);
        }
        else if (valAtk < valAtkEnnemi)
        {
            int degAtk = (int) (Math.random() * (ennemi.getArme().getMaxDamage()-1)+1);
            map.setText(map.getText() + "C'est l'ennemi qui vous attaque ! Il vous inflige " + degAtk + " points de dégats. \n");
            if (!Main.p.getInventaire().getArmure().equals(Armure.ARMURERREUR)) {
                map.setText(map.getText() + "Ces dégats sont réduits de " + Main.p.getInventaire().getArmure().getReducDegats() + " points grâce à votre " +
                        Main.p.getInventaire().getArmure().getName() + " ! \n");
            }
            Main.p.setHp(Main.p.getHp()-(degAtk-Main.p.getInventaire().getArmure().getReducDegats()));
        }
    }

}