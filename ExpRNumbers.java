import java.util.Scanner;

public class ExpRNumbers {
    public static void main(String[] args) {
        expRNumbersMethod();
    }

    public static void expRNumbersMethod() {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Podaj liczbę");
        double a = input.nextInt();
        System.out.println("Podaj stopień potęgi");
        double b = input.nextInt();
        if (b > 128 || b < 0) {
            System.out.println("Wykładnik za wysoki albo mniejszy od 0");
        } else {
            double result = calc.calculate(a, b, "P");
            System.out.println(result);
        }
    }
}