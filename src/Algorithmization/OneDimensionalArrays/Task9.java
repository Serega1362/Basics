package Algorithmization.OneDimensionalArrays;

import java.util.Scanner;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если татих чисел несколько, то определить наименьшее из них.
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите целое число элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int k = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int frequent = 0;
            array[i] = (int) (Math.random() * n);
            for (int j = 0; j < array.length; i++) {
                if (array[i] == array[j]) {
                    frequent++;
                }
                if (frequent > max) {
                    max = frequent;
                    k = array[i];
                }
            }

            System.out.print(array[i] + " , ");

        }

    }
}
