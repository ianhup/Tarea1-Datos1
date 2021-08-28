module com.datos1.mitarea1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.datos1.mitarea1 to javafx.fxml;
    exports com.datos1.mitarea1;
}