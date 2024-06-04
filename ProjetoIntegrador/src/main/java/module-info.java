module projetoIntegrador.principal {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.apache.commons.codec;
	requires opencsv;

    opens projetoIntegrador.principal to javafx.fxml;
    exports projetoIntegrador.principal;
}
