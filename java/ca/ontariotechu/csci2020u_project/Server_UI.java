package ca.ontariotechu.csci2020u_project;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Server_UI {
    @FXML
    private TextArea txtArea;

    public void write(String line){
        txtArea.appendText(line + "\n");
    }

}