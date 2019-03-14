
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number?");
        int upTo = Integer.parseInt(reader.nextLine());
        
        int number = 1;
        while(number <= upTo) {
            System.out.println(number);
            number++;
        }
    }
}
