package Algorithmization.OneDimensionalArrays;

/*
Дана последовательность целых чисел a1, a2, a3.
Образовать новую последовательность, выбросив из
исходной те члены, которые равны min (a1, a2, a3).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите целое число элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        int minValue = Integer.MAX_VALUE;
        for (int tmpEl : array)
            minValue = Math.min(minValue, tmpEl);
        int countMinElem = 0;
        for (int tmpEl : array)
            if (tmpEl == minValue)
                countMinElem++;

        int[] newArray = new int[n - countMinElem];
        int indexNewArray = 0;
        for (int tmpEl : array)
            if (tmpEl != minValue) {
                newArray[indexNewArray++] = tmpEl;
                System.out.print(tmpEl + ", ");
            }
    }
}