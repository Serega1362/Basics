package Algorithmization.OneDimensionalArrays;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {

    }

    private static boolean isPrime(int i) {
        if (i <= 3) {
            return i > 1;
        } else if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }

        int tmp = 5;

        while (tmp * tmp <= i) {
            if (i % tmp == 0 || i % (tmp + 2) == 0) {
                return false;
            }
            tmp += 6;
        }
        return true;
    }
}