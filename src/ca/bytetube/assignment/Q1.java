package ca.bytetube.assignment;

//1.Convert a positive decimal number to binary number.


public class Q1 {
    public static void main(String[] args) {
        DecimalNumberToBinaryNumber(16);
        DecimalNumberToBinaryNumber(35);
        DecimalNumberToBinaryNumber(42);

    }

    public static void DecimalNumberToBinaryNumber(long DecimalNumber) {
        String BinaryNumber = "";
        while (DecimalNumber != 0) {
            BinaryNumber = DecimalNumber % 2 + BinaryNumber;
            DecimalNumber = DecimalNumber / 2;
        }
        System.out.println(BinaryNumber);
    }
}