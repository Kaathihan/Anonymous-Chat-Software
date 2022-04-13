/**
 * @author Ginthushan Kandasamy
 * @author Kaathihan Luxmachandran 
 * @author Wenbo Zhang
 * @author Michael DeMelo 
 * @version 1.0
 * @since 1.0
 */

package ca.ontariotechu.csci2020u_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
