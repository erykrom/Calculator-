
import java.util.Scanner;

public class CalculatorTest {
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Wybierz dane wejściowe:\n 1 - Dwie liczby rzeczywiste \n 2 - Liczba razy Wektor/Macierz \n 3 - Dwa wektory \n 4 - Dwie macierze" +
                    " \n 5 - Macierz i Wektor");

            int mainOption = input.nextInt();
            input.nextLine();

            if(mainOption == 2){
                System.out.println("1 - Liczba razy Wektor\n 2 - Liczba razy Macierz");

                int scalarOption = input.nextInt();
                input.nextLine();

                if(scalarOption == 1){
                    MultiplyScalar_Vector.multiScalarVectorMethod();
                }

                if(scalarOption == 2)
                    MultiplyScalar_Matrix.multiScalarMatrixMethod();
            }

            if(mainOption == 3){
                System.out.println("Dostępne działania:\n 1 - Dodawanie \n 2 - Odejmowanie");

                int vectorsOption = input.nextInt();
                input.nextLine();

                if(vectorsOption == 1)
                    Add_Vectors.addVectorsMethod();
                if(vectorsOption == 2)
                    Sub_Vectors.subVectorsMethod();
            }

            if (mainOption == 4) {
                System.out.println("Dostępne działania:\n 1 - Dodawanie\n 2 - Odejmowanie \n 3 - Mnożenie");

                int matrixOption = input.nextInt();
                input.nextLine();

                if (matrixOption == 1)
                    Add_Matrix.addMatrixMethod();
                if (matrixOption == 2)
                    Subtract_Matrix.subtractMatrixMethod();
                if (matrixOption == 3)
                    Multiply_Matrix.multiplyMatrixMethod();
            }
                    if (mainOption == 1) {
                    System.out.println(" Wybierz operatory: \n 1 - (+), (-), (*), (/) \n 2 - Pierwiastkowanie stopnia 2, \n 3 - Potęgowanie");

                    int secondOption = input.nextInt();
                    input.nextLine();

                if (secondOption == 1)
                    RNumbersCalc.simpleCalcMethod();

                if (secondOption == 2)
                   SqrtRNumbers.sqrtRNumbersMethod();

                if (secondOption == 3)
                    ExpRNumbers.expRNumbersMethod();
                }

                System.out.println("Koniec programu, wprowadź " + EXIT);
                System.out.println("Kontynuuj, wprowadź wartość inną od " + EXIT);
            }
            while (input.nextInt() != EXIT) ;
            input.close();
        }
    }

