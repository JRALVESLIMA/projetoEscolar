module com.loja.emporio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.loja to javafx.fxml;
    opens com.loja.controllers to javafx.fxml;
    opens com.loja.models to javafx.base;

    exports com.loja;
    exports com.loja.controllers;
    exports com.loja.models;
}
