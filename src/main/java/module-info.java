module controle.somanome {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires transitive java.sql;
    requires java.desktop;

    opens controle.somanome.Controller to javafx.fxml;
    exports controle.somanome.Controller;
    opens controle.somanome.Main to javafx.fxml;
    exports controle.somanome.Main;
    opens controle.somanome.Model to javafx.fxml;
    exports controle.somanome.Model;
}