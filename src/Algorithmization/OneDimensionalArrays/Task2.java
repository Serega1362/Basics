package Algorithmization.OneDimensionalArrays;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного
Z, этим числом. Подсчитать количество замен.
*/

public class Task2{
    public static void main(String[] args) {
        double[] a = new double[10];
        double b = 5;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = +i;
            if (a[i] > b) {
                a[i] = b;
                sum++;
            }
            System.out.println("Последовательность действительных чисел " + a[i]);
        }
        System.out.println("Колличество замен " + sum);
    }
}