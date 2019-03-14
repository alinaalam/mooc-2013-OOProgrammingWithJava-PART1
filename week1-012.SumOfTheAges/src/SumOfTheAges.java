
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /*
        Type your name: Matti
        Type your age: 14

        Type your name: Arto
        Type your age: 12

        Matti and Arto are 26 years old in total.
        */
        // Implement your program here
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String secondName = reader.nextLine();
        
        System.out.println("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        System.out.println(name + " and " + secondName + " are " + (age + secondAge) + " years old in total");
    }
}
