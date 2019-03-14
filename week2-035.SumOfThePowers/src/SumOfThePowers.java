
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        
        while(power >= 0) {
            result += (int) Math.pow(2, power);
            power--;
        }
        
        System.out.println("The result is " + result);

    }
}
