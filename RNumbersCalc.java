import java.util.Scanner;

public class RNumbersCalc {
    public static void main(String[] args) {
        simpleCalcMethod();
    }

    public static void simpleCalcMethod() {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Podaj pierwszą liczbę:");
        double a = input.nextInt();
        input.nextLine();
        System.out.println("Wpisz znak działania");
        String func = input.nextLine();
        System.out.println("Podaj drugą liczbę:");
        double b = input.nextInt();
        double result = calc.calculate(a, b, func);
        System.out.println(a + func + b + " = " + result);

    }

}
