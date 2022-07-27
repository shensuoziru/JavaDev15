package ca.bytetube.assignment;

/*
5.Convert seconds to hour, minute and seconds
Sample Data:
Input seconds: 86399
23:59:59
 */

public class Q5 {
    public static void main(String[] args) {
        secondsConvert(86399);
        secondsConvert(4789);
        secondsConvert(23399);

    }

    public static void secondsConvert(int inputSeconds) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        seconds = inputSeconds % 60;
        minutes = (inputSeconds / 60) % 60;
        hours = (inputSeconds / 60) / 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
