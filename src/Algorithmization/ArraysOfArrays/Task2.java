package Algorithmization.ArraysOfArrays;

import java.util.Arrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i+1)+(j*2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим элементы стоящие на диагонали: ");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
