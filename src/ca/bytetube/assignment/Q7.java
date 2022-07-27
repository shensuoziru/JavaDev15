package ca.bytetube.assignment;

//7.Merge two given sorted array of integers and create a new sorted array.
//(ascending sequence for example)
public class Q7 {
    public static void main(String[] args) {
        int[] mergeArr = mergeSortedArray(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        for (int ele : mergeArr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] mergeArr1 = mergeSortedArray(new int[]{1, 2, 3, 4, 9}, new int[]{1, 4, 5, 6});
        for (int ele1 : mergeArr1) {
            System.out.print(ele1 + " ");
        }
        System.out.println();
        int[] mergeArr2 = mergeSortedArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{4, 5, 7, 9, 10, 11, 12});
        for (int ele2 : mergeArr2) {
            System.out.print(ele2 + " ");
        }

    }

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        return arr3;

    }

//    public static int[] mergeSortedArray1(int[] numb1, int m, int[] numb2,int n) {
//
//        int i1 = m-1, i2 = n-1, k = 0;
//        while (i1 > -1 && i2 > -1) {
//            if (numb1[i1] < numb2[i2]) {
//                arr3[k++] = numb1[i1++];
//            } else {
//                arr3[k++] = numb2[i2++];
//            }
//        }
//        while (i1 < numb1.length) {
//            arr3[k++] = numb1[i1++];
//        }
//        while (i2 < numb2.length) {
//            arr3[k++] = numb2[i2++];
//        }
//        return arr3;
//
//    }

}
