package Entities;

public class OneOverX extends Button{
    public OneOverX(String text) {
        super(text);
    }

    @Override
    public float DoOp(float num) {
        return (1/num);
    }
}
