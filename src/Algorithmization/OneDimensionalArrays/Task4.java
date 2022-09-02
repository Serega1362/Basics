package Algorithmization.OneDimensionalArrays;

// Даны действительные числа a1, a2, a3,...,an. Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double array[] = new double[10];
        System.out.print("Сгенерированный массив: ");
        int minIndex = 0;
        int maxIndex = 0;
        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ", ");
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            } else if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

        }
        double temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
        System.out.println("\nМы получили массив:" + Arrays.toString(array));
    }
}
