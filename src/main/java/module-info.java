module com.example.gui_client {
    requires javafx.controls;
    requires javafx.fxml;
    requires klient;


    opens gui.client to javafx.fxml;
    exports gui.client;
}