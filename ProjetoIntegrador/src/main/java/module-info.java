module projetoIntegrador.view {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.apache.commons.codec;
	requires opencsv;
	requires javafx.base;
	requires java.scripting;

    opens projetoIntegrador.view to javafx.fxml;
    exports projetoIntegrador.view;
}
