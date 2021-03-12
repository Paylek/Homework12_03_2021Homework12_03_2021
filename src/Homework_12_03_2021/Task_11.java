package Homework_12_03_2021;

import java.util.Random;
import java.util.Scanner;

public class Task_11 {

    public static void main (String args[]) {
        int n = scannerInt();
        int [] arr = initArray(n);
        outPutFirstArray(arr);
        int [] arr_2 = new int[n];
        arr_2 = oddMappings(arr, arr_2,  n);
        outPutSecondArray(arr_2, arr, n);
    }

    public static int [] oddMappings(int [] arr, int [] arr_2, int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 1) {
                for (int j = k - 1; j < k; j++)
                    arr_2[j] = arr[i];
                k++;
            }
        }
        return arr_2;
    }

    public static int sizeTheSecondArray(int [] arr, int [] arr_2, int n) {

        int k = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 1) {
                for (int j = k - 1; j < k; j++)
                    arr_2[j] = arr[i];
                k++;
            }
        }
        return k - 1;
    }

    public static void outPutFirstArray(int arr[]) {
        System.out.println("Первоначальный массив: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    public static void outPutSecondArray(int arr_2[], int arr[], int n) {
        System.out.println("Массив из нечетных чисел первого массива: ");
        for (int i = 0; i < sizeTheSecondArray(arr, arr_2, n); i++)
            System.out.print(arr_2[i]);
    }

    public static int[] initArray(int n) {

        int [] arr = new int[n];
        Random ran = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10) ;

        }
        return arr;
    }

    public static int scannerInt() {

        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Введите размер: \r");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Введите правильно размер: \r");
        }
        number = in.nextInt();
        if (number < 3)
            System.out.println("Введите правильно размер: \r");
        return number;
    }
}
