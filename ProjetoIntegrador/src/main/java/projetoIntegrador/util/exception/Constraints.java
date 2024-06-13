package projetoIntegrador.util.exception;


import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;

/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 24/05/2024
 * @brief Constraints
 */

public class Constraints {
    public static void setTextFieldInteger(TextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*")) {
                txt.setText(oldValue);
            }
        });
    }
    public static void setTextFieldMaxLength(TextField txt, int max) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && newValue.length() > max) {
                txt.setText(oldValue);
            }
        });
    }
    public static void setTextFieldDouble(TextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }
    
    public static boolean alertaSimNao(String msgTitulo, String msgAlerta) {
		ButtonType sim = new ButtonType("Sim", ButtonData.OK_DONE);
		ButtonType nao = new ButtonType("Não", ButtonData.CANCEL_CLOSE);
		Alert alert = new Alert(AlertType.CONFIRMATION, msgAlerta, sim, nao);

		alert.setTitle(msgTitulo);
		Optional<ButtonType> result = alert.showAndWait();

		return result.orElse(nao) == sim;
	}
    public static boolean alertaOk(String msgTitulo, String msgAlerta) {
		ButtonType ok = new ButtonType("OK", ButtonData.OK_DONE);
		//ButtonType nao = new ButtonType("Não", ButtonData.CANCEL_CLOSE);
		Alert alert = new Alert(AlertType.WARNING, msgAlerta, ok);
		alert.setTitle(msgTitulo);
		Optional<ButtonType> result = alert.showAndWait();

		return result.orElse(ok) == ok;
	}

}
