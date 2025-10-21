package com.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage window) {
        Button button1 = new Button("This is a first button");

        Button button2 = new Button("This is a second button");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button1);
        componentGroup.getChildren().add(button2);

        Scene scene = new Scene(componentGroup, 300, 200);

        window.setScene(scene);
        window.setTitle("Two Buttons Example");
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}
