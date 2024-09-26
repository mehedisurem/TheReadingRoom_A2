module org.example.thereadingroom_a2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.thereadingroom_a2 to javafx.fxml;
    exports org.example.thereadingroom_a2;
}