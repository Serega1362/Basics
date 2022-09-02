package Algorithmization.ArraysOfArrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        System.out.println("Выводим массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) + (j * 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим 3 строку: ");
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\n" +"Выводим 2 столбец: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}