
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.println("Type the password: ");
        String userPassword = reader.nextLine();
        
        while(!password.equals(userPassword)) {
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            userPassword = reader.nextLine();
        }
        
        System.out.println("Right!");
        System.out.println("The secret is: Love all or perish!");
    }
}
