/**
 * @author Ginthushan Kandasamy
 * @author Kaathihan Luxmachandran 
 * @author Wenbo Zhang
 * @author Michael DeMelo 
 * @version 1.0
 * @since 1.0
 */

module ca.ontariotechu.csci2020u_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.ontariotechu.csci2020u_project to javafx.fxml;
    exports ca.ontariotechu.csci2020u_project;
}