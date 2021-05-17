package fr.fgrennerat.calculusgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TilePane tilePane = new TilePane();
        Scene scene = new Scene(tilePane, 1600, 450);
        stage.setTitle("Wonder Game");
        stage.setScene(scene);

        //Creation de boutons
        ArrayList<Button> listeBoutons = new ArrayList<>();
        final int[] product = {1};
        for (int i = 1; i < 30; i++) {
            Button button = new Button(String.valueOf(i));
            button.setPrefSize(40, 20);
            listeBoutons.add(button);
            // action event
            final int finalI = i;
            EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e){
                    product[0] *= finalI;
                    button.setText(String.valueOf(product[0]));
                    button.setTextFill(Color.INDIANRED);
                    //button.setStyle();
                }
            };

            // when button is pressed
            button.setOnAction(event);
        }
        //Creating the tile pane

        //Setting the orientation for the Tile Pane
        tilePane.setOrientation(Orientation.HORIZONTAL);
        //Setting the alignment for the Tile Pane
        tilePane.setTileAlignment(Pos.CENTER_LEFT);
        //Setting the preferred columns for the Tile Pane
        tilePane.setPrefRows(10);
        //Retrieving the observable list of the Tile Pane
        tilePane.getChildren().addAll(listeBoutons);

        //Creation d'un cadre texte
        Text zoneTextuelle = new Text("Click on numbers to obtain the product 45 ");
        //zoneTextuelle.setWrappingWidth(400);
        tilePane.getChildren().add(zoneTextuelle);
        //zoneTextuelle.getChildren().add("asdfadsf")

        //Setting the stage
        //Scene scene = new Scene(root, 595, 200, Color.BEIGE);
        
        
        ///////
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
