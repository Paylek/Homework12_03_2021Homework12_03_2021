package Homework_12_03_2021;

public class Task_10 {
    public static void main (String args[]) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        System.out.printf("Сумма нечетных чисел составила %d", sum);
    }
}
