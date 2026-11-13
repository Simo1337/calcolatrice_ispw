package Boundaries;

import Controllers.CalcController;
import java.util.Scanner;

public class CalcBoundary {
    private final CalcController CC = new CalcController(this);
    private String log = "";
    private final Scanner inputChannel;

    public CalcBoundary(Scanner inputChannel){
        this.inputChannel = inputChannel;
    }

    public void Start(){
        while (true){
            System.out.println("Premere pulsante: ");
            String newInput = inputChannel.nextLine();
            if (newInput.equals("1/x")){
                onFunctionClick(newInput);
            }
            else{
                WriteOnLog(newInput);
            }
        }
    }

    private void onFunctionClick(String op){
        CC.DoOperation(op);
        log = "";
    }

    public void WriteOnLog(String textToWrite){
        log += textToWrite;
    }

    public String GetLog(){
        return log;
    }

    public void PrintResult(float res){
        System.out.println(res);
    }
}
