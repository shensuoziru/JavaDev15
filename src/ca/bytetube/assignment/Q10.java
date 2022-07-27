package ca.bytetube.assignment;

//10.Sum values of an array.

public class Q10 {
    public static void main(String[] args) {
        System.out.println(sumValueOfArray(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(sumValueOfArray(new int[]{21, 2, 6, 41}));
        System.out.println(sumValueOfArray(new int[]{0, 0, 3, 4, 5, 0}));
    }

    public static int sumValueOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
