package ca.bytetube.assignment;

//6.Find the max value in an array

public class Q6 {
    public static void main(String[] args) {
//        maxValueInArray(new int[]{2, 7, 9, 10, 35});
//        maxValueInArray(new int[]{70, 5, 9, 10, 32, 1});
//        maxValueInArray(new int[]{70, 5, 9, 1002, 32, 1, 89, 67, 1, 209});

        getMaxValueInArray(new int[]{2,7,9,6,8,15,1},0,6);
        System.out.println(getMaxValueInArray(new int[]{2,7,9,6,8,15,1},0,6));
    }

    public static void maxValueInArray(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        System.out.println("Max value in this array is: " + Max);

    }

    public static int getMaxValueInArray(int[]arr,int left,int right){
        if(left == right) return arr[left];
        int mid = (left+right)/2;
        int leftMax = getMaxValueInArray(arr, left, mid);
        int rightMax = getMaxValueInArray(arr, mid+1, right);
        int max = Math.max(leftMax,rightMax);
        return max;
    }

}
