package fr.iut.aix;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static Personnage p = new Personnage("");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

}