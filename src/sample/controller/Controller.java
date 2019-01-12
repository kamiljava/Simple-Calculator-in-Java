package sample.controller;

import animatefx.animation.FadeIn;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    Double temp = 0.0, sum = 0.0;
    boolean isOperatorPressed;
    String operatorPressed = "";

    @FXML
    TextField txtNumber;
    @FXML
    Button btnReset;
    @FXML
    Button btnPercent, btnSubtract, btnDivide, btnMultiply, btnPlus, btnSum;
    @FXML
    Button btnPoint, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;

    public void initialize(URL url, ResourceBundle rb) {
        txtNumber.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*([\\.]\\d*)?")) {
                    txtNumber.setText(oldValue);
                }
            }
        });
    }

    @FXML
    private void numberClick(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button btn = (Button) event.getSource();
            if (event.getSource() == btnZero) {
                new FadeIn(btnZero).play();
            }
            if (event.getSource() == btnOne) {
                new FadeIn(btnOne).play();
            }
            if (event.getSource() == btnTwo) {
                new FadeIn(btnTwo).play();
            }
            if (event.getSource() == btnThree) {
                new FadeIn(btnThree).play();
            }
            if (event.getSource() == btnFour) {
                new FadeIn(btnFour).play();
            }
            if (event.getSource() == btnFive) {
                new FadeIn(btnFive).play();
            }
            if (event.getSource() == btnSix) {
                new FadeIn(btnSix).play();
            }
            if (event.getSource() == btnSeven) {
                new FadeIn(btnSeven).play();
            }
            if (event.getSource() == btnEight) {
                new FadeIn(btnEight).play();
            }
            if (event.getSource() == btnNine) {
                new FadeIn(btnNine).play();
            }
            if (event.getSource() == btnPoint) {
                new FadeIn(btnPoint).play();
            }
            if (isOperatorPressed) {
                txtNumber.setText(btn.getText().trim());
            } else {
                txtNumber.setText(txtNumber.getText().trim() + btn.getText().trim());
            }
            isOperatorPressed = false;
        }

    }

    @FXML
    private void operatorClick(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button btn = (Button) event.getSource();
            if (!txtNumber.getText().isEmpty()) {
                temp = Double.valueOf(txtNumber.getText());
                if (btn.getText().equals("%")) {
                    temp = (temp / 100);
                }
                switch (operatorPressed) {
                    case "/":
                        sum /= temp;
                        break;
                    case "x":
                        sum *= temp;
                        break;
                    case "+":
                        sum += temp;
                        break;
                    case "-":
                        sum -= temp;
                        break;
                    default:
                        sum = temp;
                }
            }

            if (btn.getText().equals("=") || btn.getText().equals("%")) {
                txtNumber.setText(String.valueOf(sum));
                operatorPressed = "";
            } else {
                txtNumber.setText("");
                operatorPressed = btn.getText().trim();
            }
            isOperatorPressed = true;
            if (event.getSource() == btnSum) {
                new FadeIn(btnSum).play();
            }
            if (event.getSource() == btnDivide) {
                new FadeIn(btnDivide).play();
            }
            if (event.getSource() == btnSubtract) {
                new FadeIn(btnSubtract).play();
            }
            if (event.getSource() == btnPlus) {
                new FadeIn(btnPlus).play();
            }
            if (event.getSource() == btnMultiply) {
                new FadeIn(btnMultiply).play();
            }
            if (event.getSource() == btnPercent) {
                new FadeIn(btnPercent).play();
            }
        }
    }

    @FXML
    private void deleteClick(ActionEvent event) {
        txtNumber.setText("");
        temp = 0.0;
        sum = 0.0;
        isOperatorPressed = false;
        operatorPressed = "";
        if (event.getSource() == btnReset) {
            new FadeIn(btnReset).play();
        }
    }
}
