package Homework_12_03_2021;

public class Task_08 {
    public static void main (String args[]) {
        double a = 10;
        int n = 6;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            a += a / 100;
            sum += a;
        }

        outPut(sum);
    }

    public static void outPut(double sum) {
        System.out.println("Суммарный путь состовляет: " + sum);
    }


}
