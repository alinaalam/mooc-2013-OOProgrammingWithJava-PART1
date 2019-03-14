
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int until = Integer.parseInt(reader.nextLine());
        
        int number = 1;
        int sum = 0;
        
        while(number <= until) {
            sum += number;
            number++;
        }
        
        System.out.println("Sum is: " + sum);
    }
}
