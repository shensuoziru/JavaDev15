package ca.bytetube.assignment;

//8.Check if a positive number is a palindrome or not.

public class Q8 {
    public static void main(String[] args) {
        checkNumber(12321);
        checkNumber(12321123);
        checkNumber(54322345);

    }

    public static void checkNumber(int numb) {
        String str = String.valueOf(numb);
        String str1 = "";
        int number = numb;
        while (numb != 0) {
            str1 += numb % 10;
            numb = numb / 10;
        }
        System.out.println("number: " + number);
        if (str.equals(str1)) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }

}
