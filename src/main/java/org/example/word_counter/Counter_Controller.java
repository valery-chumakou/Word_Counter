package org.example.word_counter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Counter_Controller extends Application {
    private static Scene scene;
    private static Stage primaryStage;

    public void start (Stage stage) throws Exception {
        primaryStage = stage;
        scene = new Scene(loadFXML("word_counter"), 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    static void setRoot(String fxml) throws Exception {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Counter.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main (String [] args) {
        launch();
    }
}
