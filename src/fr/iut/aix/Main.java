package fr.iut.aix;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static Personnage p = new Personnage("");
    public static int MAXPTSALLOUER = 50;

    public BorderPane root = new BorderPane();
    public Scene scene = new Scene(root);

    //Modifs dans les events
    IntegerProperty nombreRestant = new SimpleIntegerProperty(5);


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
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

            if (nombreRestant.get() > 0)
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

            if (nombreRestant.get() > 0)
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

            if (nombreRestant.get() > 0)
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

            if (nombreRestant.get() > 0)
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
            if (nombreRestant.get() > 0)
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

        Button choixArmes = new Button("Suivant");
        choixArmes.setOnAction(event -> {
            interfaceChoixArmes();
        });
        center.getChildren().addAll(choixDeNom,nbRestants,stats,charismeText,choixDeCharisme,choixArmes);
        root.setCenter(center);
    }

    public void interfaceChoixArmes()
    {

    }
}