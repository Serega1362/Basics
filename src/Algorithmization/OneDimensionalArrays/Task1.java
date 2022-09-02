package Algorithmization.OneDimensionalArrays;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int k = 2;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = +i;
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
    }
}
