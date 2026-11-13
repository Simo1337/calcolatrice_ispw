package Controllers;

import Boundaries.CalcBoundary;
import DAO.BtnDAO;
import Entities.Button;

public class CalcController {
    private CalcBoundary CB;

    public CalcController(CalcBoundary CB){
        this.CB = CB;
    }

    public void DoOperation(String op){
        Button PressedBTN = BtnDAO.GetClickedBTN(op);
        String log = CB.GetLog();
        float res = PressedBTN.DoOp(Integer.parseInt(log));
        CB.PrintResult(res);
    }
}
