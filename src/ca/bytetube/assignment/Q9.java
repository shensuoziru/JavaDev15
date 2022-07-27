package ca.bytetube.assignment;

//9.Search a value in a sorted m * n matrix.

import java.io.ObjectOutput;

public class Q9 {
    public static void main(String[] args) {
        int[] result = SearchValueInSortedMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("The value is in " + (result[0] + 1) + "row " + (result[1] + 1) + "column.");
        } else {
            System.out.println("The value is not in this matrix");
        }
        int[] result1 = SearchValueInSortedMatrix(new int[][]{{1, 4, 13}, {4, 15, 16}, {7, 8, 9}}, 15);
        if (result1[0] != -1 && result1[1] != -1) {
            System.out.println("The value is in " + (result1[0] + 1) + "row " + (result1[1] + 1) + "column.");
        } else {
            System.out.println("The value is not in this matrix");
        }
        int[] result3 = SearchValueInSortedMatrix(new int[][]{{11, 14, 23, 26, 29}, {4, 45, 46, 28, 89, 91}, {7, 8, 9, 10, 11, 12}}, 100);
        if (result3[0] != -1 && result3[1] != -1) {
            System.out.println("The value is in " + (result3[0] + 1) + "row " + (result3[1] + 1) + "column.");
        } else {
            System.out.println("The value is not in this matrix");
        }



    }

    public static int[] SearchValueInSortedMatrix(int[][] matrix, int value) {
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix[0].length) {
                if (value == matrix[i][j]) {
                    return new int[]{i, j};
                } else if (value > matrix[i][j]) {
                    j++;
                } else {
                    i++;
                }
            }
            i++;

        }
        return new int[]{-1, -1};
    }


//    public static Boolean SearchValueInSortedMatrix1(int[][] matrix, int value) {
//        int i = 0;
//        while (i < matrix.length) {
//            int j = matrix[0].length-1;
//            while (j > -1) {
//                if (value == matrix[i][j]) {
//                    return true;
//                } else if (value > matrix[i][j]) {
//                    i++;
//                } else {
//                    j--;
//                }
//            }
//            i++;
//
//        }
//        return false;
//    }
}
