package projetoIntegrador.view;

import java.io.IOException;

import org.apache.commons.codec.binary.StringUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInView {
    
    @FXML
    private TextField user;
    
    @FXML
    private PasswordField password;

    @FXML
    private void evtEntrarClick() throws IOException {
    	if (user.getText().equals("admin") && password.getText().equals("123456")) {
    		App.setRoot("Pesquisa");
    	}
    	else {
    	    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle(StringUtils.newStringUtf8("Atenção".getBytes()));
    	    alert.setHeaderText(StringUtils.newStringUtf8("Usuário ou senha incorretos!".getBytes()));
    	    alert.setContentText("Por favor tente novamente!");
    	    alert.showAndWait();
    	}
    }
    
    @FXML
    private void evtEsqueciSenhaClick() {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	if (user.getText().isBlank()) {
    	    alert.setTitle(StringUtils.newStringUtf8("Atenção".getBytes()));
    	    alert.setHeaderText(StringUtils.newStringUtf8("Favor informar seu e-mail de usuário".getBytes()));
    	}else {
    	    alert.setTitle(StringUtils.newStringUtf8("Atenção".getBytes()));
    	    alert.setHeaderText(StringUtils.newStringUtf8(String.format("E-mail enviado para %s", user.getText()).getBytes()));
    	}
	    

	    alert.showAndWait();
    }
}
