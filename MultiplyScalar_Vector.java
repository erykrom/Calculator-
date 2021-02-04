import java.util.Scanner;
public class MultiplyScalar_Vector {
    public static void main(String[] args) {
        multiScalarVectorMethod();
    }

    public static void multiScalarVectorMethod() {
        int p, q, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy w pierwszym wektorze:");
        p = s.nextInt();
        if (p > 2) {
            System.out.println("Za duża liczba");
        } else {
            System.out.print("Podaj liczbę kolumn w pierwszym wektorze:");
            q = s.nextInt();
            if (q > 2) {
                System.out.println("Za duża liczba");
                System.out.print("Podaj skalar:");
                m = s.nextInt();
                if (m > 2) {
                    System.out.println("Za duża liczba");
                } else {

                    int scalarVector[][];
                    int a[][] = new int[p][q];
                    scalarVector = new int[p][q];

                    System.out.println("Podaj elementy pierwszym wektorze:");
                    for (int i = 0; i < p; i++) {
                        for (int j = 0; j < q; j++) {
                            a[i][j] = s.nextInt();
                        }
                    }
                    System.out.println("Pierwszy wektor:");
                    for (int i = 0; i < p; i++) {
                        for (int j = 0; j < q; j++) {
                            System.out.print(a[i][j] + " ");
                        }
                        System.out.println("");
                    }

                    for (int i = 0; i < scalarVector.length; i++) {
                        for (int j = 0; j < scalarVector[i].length; j++) {
                            scalarVector[i][j] = (a[i][j] * m);
                        }
                    }
                    System.out.println("Wektor po przemnożeniu:");
                    for (int i = 0; i < scalarVector.length; i++) {
                        for (int j = 0; j < scalarVector[i].length; j++) {
                            System.out.print(scalarVector[i][j] + " ");
                        }
                        System.out.println("");
                    }
                }
            }
        }
    }
}

