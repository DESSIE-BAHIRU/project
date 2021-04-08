package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label developed = new Label("Developed by: ");
        Label eyob = new Label("Eyob Abebe            ID-1102644");
        Label nati = new Label("Natnael Mebratu     ID-1102596");
        Label dessie = new Label("Dessie Bahiru          ID-1102885");

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(15));
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().addAll(developed, eyob, nati, dessie);
        flowPane.setMaxSize(1000, 100);

        VBox flowPane1 = new VBox(15);
        flowPane1.setMpackage main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label developed = new Label("Developed by: ");
        Label eyob = new Label("Eyob Abebe            ID-1102644");
        Label nati = new Label("Natnael Mebratu     ID-1102596");
        Label dessie = new Label("Dessie Bahiru          ID-1102885");

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(15));
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().addAll(developed, eyob, nati, dessie);
        flowPane.setMaxSize(1000, 100);

        VBox flowPane1 = new VBox(15);
        flowPane1.setMaxSize(1000, 600);

        MainInterface mainInterface = new MainInterface();

        TabPane tabPane = mainInterface.tabPaneMethod();

        flowPane1.getChildren().addAll(flowPane, tabPane);

        primaryStage.setTitle("Final Project Management System");
        primaryStage.setScene(new Scene(flowPane1));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
