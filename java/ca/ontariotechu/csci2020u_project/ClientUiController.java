/**
 * @author Ginthushan Kandasamy
 * @author Kaathihan Luxmachandran 
 * @author Wenbo Zhang
 * @author Michael DeMelo 
 * @version 1.0
 * @since 1.0
 */

package ca.ontariotechu.csci2020u_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ClientUiController implements Initializable {
    @FXML
    private TextArea txtArea;
    @FXML
    private TextField chatMessage;
    @FXML
    private Label label;
    @FXML
    private TextField privateMessageField;

    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;

    public void write(String line){
        txtArea.appendText(line + "\n");
    }

    @FXML
    private void handleExit(){
        printWriter.println("U%s^E7*r(E&x%^I754t36");
        System.exit(0);
    }

    // this function should be used to sent message to sever, these codes only append messages to textArea.
    @FXML
    private void sendMessages(){
        String privateMessage = privateMessageField.getText();
        String message = chatMessage.getText();

        if (message != null){
            if (!privateMessage.equals("")){
                printWriter.println("@" + privateMessage + ":" + message);
                txtArea.appendText("\nprivate message to "+ privateMessage + " : " + message);
            }else {
                printWriter.println(message);
            }
        }

        chatMessage.clear();
//        System.out.println(privateMessage);

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

    /**
     * This function is used to save a chat log to a .txt file if the user desires
     */

    @FXML
    void saveChatLog(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Add All", "*"));
        fileChooser.setTitle("Save your file");
        File file = fileChooser.showSaveDialog(new Stage());

        //Gets time when chat log was saved
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        if (fileChooser != null){
            try {
                PrintStream prinS = new PrintStream(file);
                prinS.println("Chat log saved on : " + dtf.format(now) + "\n");
                prinS.println(txtArea.getText());

            }
            catch (Exception E){
                System.out.println("Failed to save chat");
            }
        }
    }
}