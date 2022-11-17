module com.example.keeptoov2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keeptoov2 to javafx.fxml;
    exports com.example.keeptoov2;
    exports com.example.keeptoov2.controllers;
    opens com.example.keeptoov2.controllers to javafx.fxml;
//    exports com.example.keeptoov2.controllers;
//    opens com.example.keeptoov2.controllers to javafx.fxml;
}