package ca.ontariotechu.csci2020u_project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ClientUiController implements Initializable {
    @FXML
    private TextArea txtArea;
    @FXML
    private TextField chatMessage;
    @FXML
    private Label label;

    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;

    public void write(String line){
        txtArea.appendText(line + "\n");
    }

    @FXML
    private void handleExit(){
        try {
            bufferedReader.close();
            printWriter.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    // this function should be used to sent message to sever, these codes only append messages to textArea.
    @FXML
    private void sendMessages(){
        String message = chatMessage.getText();
        chatMessage.clear();


        printWriter.println(message);

    }

    //This function will be used to receive message from the server
    public void receiveMessages(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msg;
                while (socket.isConnected()) {
                    try {
                        msg = bufferedReader.readLine();
                        txtArea.appendText("\n"+msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    // I directly connect to sever when the program start, later modify to require user input the address and port
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtArea.setEditable(false);
        label.setText("Welcome " + Start_Controller.username);

        String ipAddress = Start_Controller.ip;
        int port = Integer.parseInt(Start_Controller.port);
        try {
            socket = new Socket(ipAddress, port);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println(Start_Controller.username);
            this.write("Connected to server!");

            receiveMessages();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}