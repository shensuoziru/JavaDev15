package ca.bytetube.assignment;

//1.Convert a positive binary number to decimal number.

public class Q2 {
    public static void main(String[] args) {
        System.out.println(BinaryNumberToDecimalNumber(111111));
        System.out.println(BinaryNumberToDecimalNumber(110110));
        System.out.println(BinaryNumberToDecimalNumber(10011111));

    }

    public static long BinaryNumberToDecimalNumber(long BinaryNumber) {
        long DecimalNumber = 0;
        long i = 0;
        while (BinaryNumber != 0) {
            long j = BinaryNumber % 10;
            DecimalNumber += j * Math.pow(2, i);
            BinaryNumber = BinaryNumber / 10;
            i++;
        }
        return DecimalNumber;

    }
}
