import Boundaries.CalcBoundary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CalcBoundary CB = new CalcBoundary(input);

        CB.Start();
    }
}
