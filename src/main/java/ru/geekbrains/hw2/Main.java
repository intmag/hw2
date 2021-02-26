package ru.geekbrains.hw2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;
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
        int[] arr3 = new int[12];
        arr3[0] = 1;
        arr3[1] = 5;
        arr3[2] = 3;
        arr3[3] = 2;
        arr3[4] = 11;
        arr3[5] = 4;
        arr3[6] = 5;
        arr3[7] = 2;
        arr3[8] = 4;
        arr3[9] = 8;
        arr3[10] = 9;
        arr3[11] = 1;
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

        int[] arr5 = new int[5];
        int maxArr5 = 0;
        int minArr5 = 0;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
        }
        for (int i = 0; i < arr5.length; i++) {
            if (i == 0) {
                maxArr5 = arr5[i];
                minArr5 = arr5[i];
            } else {
                if (minArr5 > arr5[i]) {
                    minArr5=arr5[i];
                }
                if (maxArr5<arr5[i]) {
                    maxArr5=arr5[i];
                }
            }
        }
        System.out.println(maxArr5);
        System.out.println(minArr5);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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
