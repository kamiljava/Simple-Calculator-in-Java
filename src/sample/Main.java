package sample;


import animatefx.animation.Pulse;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("resources/fxml/sample.fxml"));
        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/sample/resources/css/Style.css");

        Image image = new Image("/sample/resources/images/logo.png");
        primaryStage.getIcons().add(image);

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

        new Pulse(root).play();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
