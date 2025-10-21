package com.application;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {
        Button back = new Button("Back ..");
        Button forth = new Button(".. Forward");

        Scene first = new Scene(back);
        Scene second = new Scene(forth);

        back.setOnAction(event -> {
            window.setScene(second);
        });

        forth.setOnAction(event -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}
