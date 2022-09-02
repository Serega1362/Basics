package Algorithmization.OneDimensionalArrays;

/*
Дан массив действительных чисел размерность которого N.
Подсчитать, сколько в неём отрицательных, положительных и нулевых элементов.
 */

    public class Task3 {
        public static void main(String[] args) {
            double[] array = new double[20];
            int min = 0;
            int max = 0;
            int nul = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = +i;
                if (array[i]>0) {
                    max++;
                }else if (array[i]<0){
                    min++;
                }else if (array[i]==0){
                    nul++;
                }
            }
            System.out.println("Колличество отрицательных чисел: " + min);
            System.out.println("Колличество положительных чисел: " + max);
            System.out.println("Колличество нулевых чисел: " + nul);
        }
    }


