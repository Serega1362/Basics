package Algorithmization.ArraysOfArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-i; j++) {
                    array[i][j] = i+1;
                System.out.print(" " + array[i][j] + " ");
                }
            System.out.println();
            }

        }
    }

