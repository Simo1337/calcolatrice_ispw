package Boundaries;

import Controllers.CalcController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcBoundary {
    @FXML
    private Label log;
    @FXML
    private Label resultTxt;
    private CalcController CC = new CalcController();

    @FXML
    private void initialize(){
        log.setText("0");
    }

    public float onNumberClick(ActionEvent event){
        String digit = ((javafx.scene.control.Button) event.getSource()).getText();
        return CC.DoOperation(digit, log.getText());
    }

    @FXML
    public void onNumberBTN(ActionEvent event){
        log.setText(Float.toString(Float.parseFloat(log.getText())*10 + onNumberClick(event)));
    }

    public void onFunctionBTN(ActionEvent event){
        resultTxt.setText(Float.toString(onNumberClick(event)));
        log.setText("0");
    }

}
