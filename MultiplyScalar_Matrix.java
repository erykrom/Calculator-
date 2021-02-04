import java.util.Scanner;
public class MultiplyScalar_Matrix {
    public static void main(String[] args) {
        multiScalarMatrixMethod();
    }

    public static void multiScalarMatrixMethod() {
        int p, q, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy w pierwszej macierzy:");
        p = s.nextInt();
        System.out.print("Podaj liczbę kolumn w pierwszej macierzy:");
        q = s.nextInt();
        System.out.print("Podaj skalar:");
        m = s.nextInt();

        int scalarMatrix[][];
        int a[][] = new int[p][q];
        scalarMatrix = new int[p][q];

        System.out.println("Podaj elementy pierwszej macierzy:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Pierwsza macierz:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < scalarMatrix.length; i++) {
            for (int j = 0; j < scalarMatrix[i].length; j++) {
                scalarMatrix[i][j] = (a[i][j] * m);
            }
        }
        System.out.println("Macierz po pomnożeniu:");
        for (int i = 0; i < scalarMatrix.length; i++){
            for (int j = 0; j < scalarMatrix[i].length; j++){
                System.out.print(scalarMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

