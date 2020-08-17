package GUI_Programming.Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stackPane = new StackPane();
        Button demoButton = new Button("Demo Button");
        demoButton.setStyle("-fx-border-color: #00008b;");
        stackPane.getChildren().add(demoButton);

        stackPane.setRotate(45);
        stackPane.setStyle("-fx-border-color: #7eff9e;");
        stackPane.setStyle("-fx-background-color: #ae79ff");
        //stackPane.setStyle("-fx-background-image: url(https://ctl.s6img.com/society6/img/NgxapElD0YHKoCgwQb_0QvpKvwg/w_700/prints/~artwork/s6-original-art-uploads/society6/uploads/misc/eb91a80da67741258b979abbd32985d9/~~/funny-english-bulldog-dabbing-prints.jpg?wait=0&attempt=0)");
        Scene scene = new Scene(stackPane, 150, 150);
        primaryStage.setTitle("NodeStyleRotateDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
