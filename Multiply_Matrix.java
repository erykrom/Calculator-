import java.util.Scanner;
public class Multiply_Matrix {
    public static void main(String[] args) {

        multiplyMatrixMethod();
    }

    public static void multiplyMatrixMethod() {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy w pierwszej macierzy:");
        p = s.nextInt();
        System.out.print("Podaj liczbę kolumn w pierwszej macierzy:");
        q = s.nextInt();
        System.out.print("Podaj liczbę wierszy w drugiej macierzy:");
        m = s.nextInt();
        System.out.print("Podaj liczbę kolumn w drugiej macierzy:");
        n = s.nextInt();
        if (p == m && q == n) {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];

            System.out.println("Podaj elementy pierwszej macierzy:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Podaj elementy drugiej macierzy:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("Pierwsza macierz:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Druga macierz:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < q; k++) {
                        c[i][j] = a[i][j] * b[i][j];
                    }
                }
            }
            System.out.println("Macierz po pomnożeniu:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Mnożenie nie jest możliwe");
        }
    }
}
