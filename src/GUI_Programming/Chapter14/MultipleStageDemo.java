package GUI_Programming.Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Button("Ok"), 500, 1000);
        primaryStage.setTitle("My JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");

        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();
    }
}
