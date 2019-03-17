import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
        NumberStatistics n1 = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while(number > -1) {
            n1.addNumber(number);
            if(number%2 == 0) {
                evenStats.addNumber(number);
            }
            else {
                oddStats.addNumber(number);
            }
            number = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum: " + n1.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
