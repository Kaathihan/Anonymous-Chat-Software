/**
 * @author Ginthushan Kandasamy
 * @author Kaathihan Luxmachandran 
 * @author Wenbo Zhang
 * @author Michael DeMelo 
 * @version 1.0
 * @since 1.0
 */

package ca.ontariotechu.csci2020u_project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Start_Controller {

    @FXML
    private TextField ipAddressField;

    @FXML
    private TextField portField;

    @FXML
    private TextField userNameField;

    @FXML
    private Button btn;

    public static String ip;
    public static String port;
    public static String username;

    @FXML
    private void connectServer(){
        ip = ipAddressField.getText();
        port = portField.getText();
        username = userNameField.getText();

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Chat.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.show();

            Stage stage = (Stage) btn.getScene().getWindow();
            stage.close();

        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }


    public void initialize(){

    }
}
