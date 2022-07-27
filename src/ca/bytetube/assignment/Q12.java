package ca.bytetube.assignment;

//12.Remove duplicate elements from an array

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] deletedArray = deletedArray(new int[]{1, 2, 2, 3, 3, 3, 4, 5, 6, 3, 3, 7, 7, 8, 7, 7, 9, 10});
        for (int ele : deletedArray) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] deletedArray1 = deletedArray(new int[]{3, 2, 4, 8, 12, 3, 5, 7, 8, 4});
        for (int ele1 : deletedArray1) {
            System.out.print(ele1 + " ");
        }
        System.out.println();
        int[] deletedArray2 = deletedArray(new int[]{9, 8, 8, 12, 12, 12, 3, 4, 6, 8, 8, 4, 1});
        for (int ele2 : deletedArray2) {
            System.out.print(ele2 + " ");
        }

    }

    public static int[] deletedArray(int[] arr) {
        int numb = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.arraycopy(arr, j + 1, arr, j, arr.length - j - 1);
                    arr = Arrays.copyOf(arr, arr.length - 1);
                    j--;
                }
            }
        }
        return arr;
    }

}
