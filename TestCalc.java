import java.util.Scanner;

public class TestCalc{

    public static double addCalc(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter 1st number: ");
            double a = scanner.nextDouble();
            System.out.println("enter operand (+ , -, *, /): ");
            String symbol = scanner.next();
            System.out.println("enter 2nd number: ");
            double b = scanner.nextDouble();

            if (symbol.equals("+")){
                System.out.println(addCalc(a, b));

            }
        }



    }
}