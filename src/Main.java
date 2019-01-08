//Задана матрица размером n х т. Найти максимальный по модулю элемент матрицы.
// Переставить строки и столбцы матрицы таким образом, чтобы максимальный по
// модулю элемент был расположен на пересечении k-й строки и k-го столбца.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int t = 0;
        int k = 0;
        int max = 0;
        System.out.println("Введите  размер матрицы n x t, а также величину k");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            t = sc.nextInt();
            k = sc.nextInt();
        }
        int str = 0;
        int stb = 0;
        int[][] mass = new int[n][t];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < t; j++) {
                mass[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + mass[i][j]);
                if (max < mass[i][j]) {
                    max = mass[i][j];
                    str = i;
                    stb = j;
                }
            }
        }
        System.out.println();
        int a = 0;
        int b = 0;
        System.out.print("Максимальный элемент " + max + " из позиции " + str + " x " + stb + " переместить в позицию " + k + " x " + k);

        a = 0;
        System.out.println();
        for (int j = 0; j < t; j++) {
            if (str != k) {
                a = mass[k][j];
                mass[k][j] = mass[str][j];
                mass[str][j] = a;
            }
            if (stb != k) {
                b = mass[j][stb];
                mass[j][stb] = mass[j][k];
                mass[j][k] = b;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < t; j++) {
                System.out.print(" " + mass[i][j]);
            }

        }

    }
}












