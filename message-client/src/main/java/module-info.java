module com.example.messageclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messageclient to javafx.fxml;
    exports com.example.messageclient;
}