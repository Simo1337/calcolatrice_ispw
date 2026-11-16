package Controllers;

import Boundaries.CalcBoundary;
import DAO.BtnDAO;
import Entities.Button;

public class CalcController {

    public float DoOperation(String op, String log){
        Button PressedBTN = BtnDAO.GetClickedBTN(op);
        return PressedBTN.DoOp(Float.parseFloat(log));
    }
}
