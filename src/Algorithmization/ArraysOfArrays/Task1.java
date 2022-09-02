package Algorithmization.ArraysOfArrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = {{7, 6, 9, 7, 8, 2, 3, 0}, {6, 1, 3, 2, 9, 2, 8, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0 && array[0][j] > array[array.length - 1][j])
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
