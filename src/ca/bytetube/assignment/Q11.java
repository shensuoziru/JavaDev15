package ca.bytetube.assignment;

//11.Find the Kth  minimum value of an array

public class Q11 {
    public static void main(String[] args) {
        int res = KthMinimumValueOfArray(new int[]{1, 5, 7, 2, 10, 9}, 3);
        System.out.print("The third minimum minimum value of this array is: ");
        System.out.println(res);
        int res1 = KthMinimumValueOfArray(new int[]{11, 29, 17, 1, 12, 6, 129}, 2);
        System.out.print("The third minimum minimum value of this array is: ");
        System.out.println(res1);
        int res2 = KthMinimumValueOfArray(new int[]{1, 2, 3, 4, 5, 12}, 6);
        System.out.print("The third minimum minimum value of this array is: ");
        System.out.println(res2);

    }

    public static int KthMinimumValueOfArray(int[] arr, int Kth) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr[Kth - 1];
    }

    public static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;

    }
}
