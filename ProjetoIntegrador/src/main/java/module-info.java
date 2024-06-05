module projetoIntegrador.principal {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.apache.commons.codec;
	requires opencsv;

    opens projetoIntegrador.view to javafx.fxml;
    exports projetoIntegrador.view;
}
