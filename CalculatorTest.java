package data.game;

import java.util.Scanner;

public class CalculatorTest {
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        do {
            System.out.println("Podaj pierwszą liczbę:");
            double a = input.nextInt();
            input.nextLine();
            System.out.println("Wpisz znak działania");
            String func = input.nextLine();
            System.out.println("Podaj drugą liczbę:");
            double b = input.nextInt();
            double result = calc.calculate(a, b, func);
            System.out.println(a + func + b + " = " + result);
            System.out.println("Koniec programu, wprowadź " + EXIT);
            System.out.println("Kontynuuj, wprowadź wartość inną od " + EXIT);
        } while (input.nextInt()!=EXIT);
        input.close();

        }
    }



