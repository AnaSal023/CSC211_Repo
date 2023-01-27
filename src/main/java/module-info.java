module com.mycompany.classlabfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.classlabfx to javafx.fxml;
    exports com.mycompany.classlabfx;
}
