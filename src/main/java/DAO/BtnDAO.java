package DAO;
import Entities.*;

public class BtnDAO {
    public static Button GetClickedBTN(String op){
        switch (op){
            case "1/x":
                Button btn = new OneOverX();
                return btn;
        }
        return new NumBTN();
    }
}
