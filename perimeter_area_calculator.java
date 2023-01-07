package Apl;
import java.util.Scanner;
//-------------------->>Theng Rachana
public class perimeter_area_calculator {

    static void rectangle(){
        //fomula of perimeter Rectangle P=2(langth + width)
        //fomula of area Rectangle A = langth * width
        Scanner in = new Scanner(System.in);
        System.out.print("Enter langth : ");
        double langth = in.nextDouble();
        System.out.print("Enter width : ");
        double width = in.nextDouble();
        System.out.println("Perimeter = " + ((langth + width) * 2));
        System.out.println("Area = " + (langth * width));

    }
    static void parallelogram(){
        //fomula of perimeter parallelogram P=2(side + base)
        //fomula of area parallelogram A = height * base
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side : ");
        double side = in.nextDouble();
        System.out.print("Enter base : ");
        double base = in.nextDouble();
        System.out.print("Enter hight : ");
        double height = in.nextDouble();
        System.out.println("Perimeter = " + ((side + base) * 2));
        System.out.println("Area = " + (height * base));

    }
    static void ellipse(){
        //fomula of perimeter ellipse P = 2π * sqrt( (a^2 + b^2) / 2 )
        //fomula of area ellipse Area = pi * a * b
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = in.nextDouble();
        System.out.print("Enter b : ");
        double b = in.nextDouble();
        System.out.println("Perimeter = " + ((2 * Math.PI) * Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2)));
        System.out.println("Area = " + (Math.PI * a * b));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("a.Calculate for Rectangle\nb.Calculate for Parallelogram\nc.Calculate for Ellipse\nd.exit");
            System.out.print("Choose option:");
            String op = in.nextLine();
            switch (op) {
                case "a":
                    rectangle();
                    break;
                case "b":
                    parallelogram();
                    break;
                case "c":
                    ellipse();
                    break;
                case "d":
                    System.exit(0);
                    break;
                default:
                    System.out.print("Can`t find...Try again!");
            }
        }
    }
}
