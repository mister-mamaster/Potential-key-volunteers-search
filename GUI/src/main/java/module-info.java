module per.ban.gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens per.ban.gui to javafx.fxml;
    exports per.ban.gui;
}