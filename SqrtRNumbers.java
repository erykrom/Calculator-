import java.util.Scanner;

public class SqrtRNumbers {
    public static void main(String[] args) {
        sqrtRNumbersMethod();
    }
    public static void sqrtRNumbersMethod() {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Podaj liczbę:");
        double a = input.nextInt();
        double result = calc.calculate(a, 2, "**");
        System.out.println(result);
    }
}
