package Homework_12_03_2021;

import java.util.Scanner;

public class Task_09 {

    public static void main (String args[]) {

        int x = scannerInt();
        int ameba = 1;
        for (int i = 0; i < x / 3; i++) {
            ameba *= 2;
        }
        System.out.printf("За %d часов получилось %d амеб", x, ameba);
    }

    public static int scannerInt() {

        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Введите количество часов: \r");

        while(!in.hasNextInt()) {

            in.next();

            System.out.println("Введите правильно размер: \r");
        }
        number = in.nextInt();

        return number;

    }

}
