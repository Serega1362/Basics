package Algorithmization.ArraysOfArrays;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

public class Task4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j+1;
                }else{
                    array[i][j] = n-j;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
