module com.clcc.crud_usuarios_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.clcc.crud_usuarios_java to javafx.fxml;
    exports com.clcc.crud_usuarios_java.model;
    opens com.clcc.crud_usuarios_java.model to javafx.fxml;
    exports com.clcc.crud_usuarios_java.service;
    opens com.clcc.crud_usuarios_java.service to javafx.fxml;
    exports com.clcc.crud_usuarios_java.controller;
    opens com.clcc.crud_usuarios_java.controller to javafx.fxml;
}