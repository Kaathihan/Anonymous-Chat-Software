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
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client_Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Client_Application.class.getResource("Chat.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Chat client");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
