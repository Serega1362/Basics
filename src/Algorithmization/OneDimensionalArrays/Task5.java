package Algorithmization.OneDimensionalArrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

public class Task5 {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 6, 7, 3, 4, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}