package data.game;
public class Calculator{

public double calculate(double a, double b, String func) {
        double result = 0;
        switch (func) {

            case "+":
        result = a + b;
        break;
        case "-":
        result = a - b;
        break;
        case "*":
        result = a * b;
        break;
        case "/":
        result = a / b;
        break;
            default:
        System.out.println("zły operator");
        }
        return result;
        }
}
