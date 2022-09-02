package OneBasicsOfSoftwareCodeDevelopment.LinearProgram;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
"Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int hours = (a / 3600);
        int temp = a - (hours * 3600);
        int minutes = temp / 60;
        int seconds = temp - (minutes * 60);
        System.out.println(hours + " ч " + minutes + " мин " + seconds + " c.");

    }
}