package GUI_Programming.Chapter14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class Ball extends Application {
    private Circle circle = new Circle(10);

    @Override
    public void start(Stage primaryStage) throws Exception {
        circle.setCenterX(100);
        circle.setCenterY(75);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITESMOKE);
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        Button button_left = new Button("Left");
        Button button_right = new Button("Right");
        Button button_up = new Button("Up");
        Button button_down = new Button("Down");

        hbox.getChildren().addAll(button_left, button_right, button_up, button_down);
        button_left.setOnAction((ActionEvent) -> {
            setleft();
        });
        button_right.setOnAction((ActionEvent) -> {
            setright();
        });
        button_up.setOnAction((ActionEvent) -> {
            setup();
        });
        button_down.setOnAction((ActionEvent) -> {
            setdown();
        });

        Pane pane =new Pane();
        pane.getChildren().addAll(circle);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);
        BorderPane.setAlignment(hbox, Pos.CENTER);

        Scene scene = new Scene(borderPane,200, 150);

        primaryStage.setTitle("Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    void setleft(){
        circle.setCenterX(circle.getCenterX()-5);
    }
    void setright(){
        circle.setCenterX(circle.getCenterX()+5);
    }
    void setup(){
        circle.setCenterY(circle.getCenterY()-5);
    }
    void setdown(){
        circle.setCenterY(circle.getCenterY()+5);
    }
}
