package fr.fgrennerat.calculusgame;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TilePane tilePane = new TilePane();
        Scene scene = new Scene(tilePane, 600, 450);
        stage.setTitle("Wonder Game");
        stage.setScene(scene);

        ArrayList<Button> listeBoutons = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Button button = new Button(String.valueOf(i));
            button.setPrefSize(200, 150);
            listeBoutons.add(button);
        }


        //Creating the tile pane

        //Setting the orientation for the Tile Pane
        tilePane.setOrientation(Orientation.HORIZONTAL);
        //Setting the alignment for the Tile Pane
        tilePane.setTileAlignment(Pos.CENTER_LEFT);
        //Setting the preferred columns for the Tile Pane
        tilePane.setPrefRows(3);
        //Retrieving the observable list of the Tile Pane
        tilePane.getChildren().addAll(listeBoutons);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
/*
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Starting app...");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculus Wonder Game");

        // create a button
        Button b = new Button("button");

        // create a stack pane
        TilePane r = new TilePane();

        // create a label
        Label l = new Label("button not selected");

        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText("   button   selected    ");
            }
        };

        // when button is pressed
        b.setOnAction(event);

        // add button
        r.getChildren().add(b);
        r.getChildren().add(l);

        primaryStage.show();
    }
}*/

    // Java Program to create a button and add it to the stage

    /*public class button extends Application {

        // launch the application
        public void start(Stage s)
        {
            // set title for the stage
            s.setTitle("creating buttons");

            // create a button
            Button b = new Button("button");

            // create a stack pane
            StackPane r = new StackPane();

            // add button
            r.getChildren().add(b);

            // create a scene
            Scene sc = new Scene(r, 200, 200);

            // set the scene
            s.setScene(sc);

            s.show();
        }
    }

}

*/