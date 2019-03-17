
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
//        BoundedCounter seconds = new BoundedCounter(59);
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter hours = new BoundedCounter(23);
//
//        System.out.print("seconds: ");
//        int s = Integer.parseInt(reader.nextLine());
//        System.out.print("minutes: ");
//        int m = Integer.parseInt(reader.nextLine());
//        System.out.print("hours: ");
//        int h = Integer.parseInt(reader.nextLine());
//
//        seconds.setValue(s);
//        minutes.setValue(m);
//        hours.setValue(h);
//
//        int i = 0;
//        while ( i < 121 ) {
//            // like in previous but seconds taken into account
//            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
//            // advance seconds
//            seconds.next();
//            // if seconds become zero, advance minutes
//            if(seconds.getValue() == 0) {
//                minutes.next();
//                // if minutes become zero, advance hours
//                if(minutes.getValue() == 0) {
//                    hours.next();
//                }
//            }
//            i++;
//        }

        // new code for advanced exercise
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            // put here the logic to advance your clock by one second
            // advance seconds
            seconds.next();
            // if seconds become zero, advance minutes
            if(seconds.getValue() == 0) {
                minutes.next();
                // if minutes become zero, advance hours
                if(minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
}
