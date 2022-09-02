package Algorithmization.OneDimensionalArrays;

/*
Даны действительные числа a1, a2,..., an.
Найти max(a1+a2n,a2+a2n-1,.., an+an+1)
*/

public class Task7 {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 6, 7, 3, 4, 8};
            int n = array.length / 2;
            double max = array[0] + array[n * 2 - 1];

            for (int i = 1; i <= n; i++) {
                double tmp = array[i] + array[n * 2 - 1];

                if (tmp > max) {
                    max = tmp;
                }
            }
            System.out.println(max);

        }
    }
