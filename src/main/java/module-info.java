module ca.ontariotechu.csci2020u_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.ontariotechu.csci2020u_project to javafx.fxml;
    exports ca.ontariotechu.csci2020u_project;
}