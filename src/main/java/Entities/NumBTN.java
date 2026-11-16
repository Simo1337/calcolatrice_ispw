package Entities;

public class NumBTN extends Button{
    public NumBTN(String text){
        super(text);
    }

    @Override
    public float DoOp(float num) {
        return Float.parseFloat(this.text);
    }
}
