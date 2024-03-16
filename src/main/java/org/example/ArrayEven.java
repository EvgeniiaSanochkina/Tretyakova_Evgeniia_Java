package org.example;

import java.util.Scanner;

public class ArrayEven {
    public void evenNumbers(int[] arr) {
        System.out.println("Чётные числа:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayEven arrayEven = new ArrayEven();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayEven.evenNumbers(arr );

    }
}