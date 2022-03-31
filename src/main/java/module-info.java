module com.example.project_csci2020 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_csci2020 to javafx.fxml;
    exports com.example.project_csci2020;
}