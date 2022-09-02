package OneBasicsOfSoftwareCodeDevelopment.Cycles;

/* Для каждого натурального числа в промежутке от m до n вывести все делители
кроме единицы и самого числа.
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int tmp = 0;
            System.out.printf("Для %d делители:\n", i);
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    System.out.println(j);
                    tmp = 1;
                }
            }
            if (tmp == 0) {
                System.out.println("Отсутствуют");
            }
        }

    }
}