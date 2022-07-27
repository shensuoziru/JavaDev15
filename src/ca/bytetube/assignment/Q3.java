package ca.bytetube.assignment;

//3.Reverse an array(string
public class Q3 {
    public static void main(String[] args) {
        int[] reverseArray = reverseArray(new int[]{1, 2, 3, 4, 5});
        for (int ele : reverseArray) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int[] reverseArray1 = reverseArray(new int[]{1, 2, 10, 4, 5, 6, 7});
        for (int ele1 : reverseArray1) {
            System.out.print(ele1 + " ");
        }
        System.out.println();
        int[] reverseArray2 = reverseArray(new int[]{8, 2, 9, 4, 1, 6, 7});
        for (int ele2 : reverseArray2) {
            System.out.print(ele2 + " ");
        }
        System.out.println();
        System.out.println(reverseString("dquwhohfqoi"));
        System.out.println(reverseString("123456789"));
        System.out.println(reverseString("qwerty"));

    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        if (arr.length == 1) return arr;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static String reverseString(String str) {
        if (str == null || str.length() == 0) return null;
        if (str.length() == 1) return str;
        char[] c = str.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            swapChar(c, i, j);
            i++;
            j--;
        }
        return String.valueOf(c);

    }

    public static void swapChar(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

    }
}
