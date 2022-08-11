module com.example.fanculo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fanculo to javafx.fxml;
    exports com.example.fanculo;
}