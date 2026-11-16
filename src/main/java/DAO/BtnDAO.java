package DAO;
import Entities.*;

public class BtnDAO {
    public static Button GetClickedBTN(String op){
        switch (op){
            case "1/x":
                return new OneOverX(op);
        }
        return new NumBTN(op);
    }
}
