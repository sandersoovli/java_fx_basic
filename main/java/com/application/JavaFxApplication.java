package com.application;

import javafx.application.Application;
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
        TextField leftText = new TextField("left");
        TextField rightText = new TextField("right");
        Button button = new Button("copy");

        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}
