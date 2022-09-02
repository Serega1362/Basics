package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
Найдите значение функции: z=((a-3)*b/2)+c;
*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float z = ((a - 3) * b / 2) + c;
        System.out.print(z);

    }
}
