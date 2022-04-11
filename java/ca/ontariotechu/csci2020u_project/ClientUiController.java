package ca.ontariotechu.csci2020u_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientUiController implements Initializable {
    @FXML
    private TextArea txtArea;
    @FXML
    private TextField chatMessage;


    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;

    public void write(String line){
        txtArea.appendText(line + "\n");
    }


    // this function should be used to sent message to sever, these codes only append messages to textArea.
    @FXML
    private void sendMessages(){
        String message = chatMessage.getText();
        chatMessage.clear();
        txtArea.appendText(message + "\n\n");
    }



    // I directly connect to sever when the program start, later modify to require user input the address and port
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            socket = new Socket("localhost", 6666);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            this.write("Hello world! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}