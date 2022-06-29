package com.baraka.task;

public class ex3 {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 2}, {4, 2, 4}, {4, 4, 2}};

        for (int i = 0; i < arr.length; i++){
            int[] inArr = arr[i];
            for (int y = 0; y < inArr.length; y++){
                System.out.println(inArr[y]);
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }
    }
}
