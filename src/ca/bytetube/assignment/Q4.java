package ca.bytetube.assignment;

//4.Count the letters, spaces, numbers and other characters of an input string

public class Q4 {
    public static void main(String[] args) {
        countElement("qewfoo1276:::");
        countElement("           ");
        countElement("122....>>>>   diuqwiuuo1oi  ");

    }

    public static void countElement(String str) {
        char[] c = str.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (Character.isLetter(c[i])) {
                letters++;
            } else if (Character.isSpaceChar(c[i])) {
                spaces++;
            } else if (Character.isDigit(c[i])) {
                numbers++;
            } else {
                others++;
            }
        }
        System.out.println("The string is: " + str);
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);

    }

}
