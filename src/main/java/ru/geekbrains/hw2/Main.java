package ru.geekbrains.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------task1--------");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        printArr(arr);
        System.out.println("-------task2--------");

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                arr2[i] = 0;
            } else {
                arr2[i] = arr2[i - 1] + 3;
            }
        }
        printArr(arr2);

        System.out.println("-------task3--------");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        printArr(arr3);

        System.out.println("-------task4--------");
        int[][] arr4 = new int[12][12];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
            }
        }
        printArr2(arr4);

        System.out.println("-------task5--------");
        int[] arr5 = new int[5];
        int maxArr5 = 0;
        int minArr5 = 0;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i + (int) (Math.random() * 10);
        }
        for (int i = 0; i < arr5.length; i++) {
            if (i == 0) {
                maxArr5 = arr5[i];
                minArr5 = arr5[i];
            } else {
                if (minArr5 > arr5[i]) {
                    minArr5 = arr5[i];
                }
                if (maxArr5 < arr5[i]) {
                    maxArr5 = arr5[i];
                }
            }
        }
        printArr(arr5);
        System.out.println("Max: " + maxArr5);
        System.out.println("Min: " + minArr5);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
