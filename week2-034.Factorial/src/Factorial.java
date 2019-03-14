import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int startingPoint = 1;
        int factorial = 1;
        
        while(startingPoint <= number) {
            factorial *= startingPoint;
            startingPoint++;
        }
        
        System.out.println("Factorial is: " + factorial);
    }
}
