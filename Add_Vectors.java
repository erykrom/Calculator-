import java.util.Scanner;

public class Add_Vectors {
    public static void main(String[] args) {
        addVectorsMethod();
    }

    public static void addVectorsMethod() {
        int p, q, m, n;
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
            } else {

                System.out.print("Podaj liczbę wierszy w drugim wektorze:");
                m = s.nextInt();
                if (m > 2) {
                    System.out.println("Za duża liczba");
                } else {
                    System.out.print("Podaj liczbę kolumn w drugim wektorze:");
                    n = s.nextInt();
                    if (p == m && q == n) {
                        int a[][] = new int[p][q];
                        int b[][] = new int[m][n];
                        int c[][] = new int[m][n];

                        System.out.println("Podaj elementy pierwszego wektora  {\\displaystyle {\\vec {a}}}{\\vec  {a}}:");
                        for (int i = 0; i < p; i++) {
                            for (int j = 0; j < q; j++) {
                                a[i][j] = s.nextInt();
                            }
                        }
                        System.out.println("Podaj elementy drugiego wektora:");
                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < n; j++) {
                                b[i][j] = s.nextInt();
                            }
                        }
                        System.out.println("Pierwszy wektor:");
                        for (int i = 0; i < p; i++) {
                            for (int j = 0; j < q; j++) {
                                System.out.print(a[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        System.out.println("Druga wektor:");
                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print(b[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        for (int i = 0; i < p; i++) {
                            for (int j = 0; j < n; j++) {
                                for (int k = 0; k < q; k++) {
                                    c[i][j] = a[i][j] + b[i][j];
                                }
                            }
                        }
                        System.out.println("Wektor po dodaniu:");
                        for (int i = 0; i < p; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print(c[i][j] + " ");
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Dodawanie nie jest możliwe");
                    }
                }
            }
        }
    }
}