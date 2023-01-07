package Apl;
//-------------------->>Theng Rachana
import java.util.Scanner;

public class quadratic_equations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value : ");
        float a = in.nextFloat();
        System.out.print("Enter b value : ");
        float b = in.nextFloat();
        System.out.print("Enter c value : ");
        float c = in.nextFloat();              //quadratic ax^2 + bx + c = 0
        double delta = Math.pow(b,2) - 4*a*c;  // Delta = b^2 - 4ac
        double sq_delta = Math.sqrt(delta);
        System.out.println("Delta = " + delta);
        if (delta > 0.0){//---------------------->>Check condition
            double x1 = (- b + sq_delta) / (2*a);
            double x2 = (- b - sq_delta) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.print("x2 = " + x2);
            System.out.print("Quadratic have 2 solution x1 and x2");
        }
        else if (delta==0) {
            double x1_2 = - b / (2 * a);
            System.out.print("x1 = x2 = " + x1_2);
            System.out.print("Quadratic have only one solution x1 and x2 are the same");
        }
        else {
            System.out.println("Quadratic have No solution because delta value is less than zero");
        }
        in.close();
    }
}
