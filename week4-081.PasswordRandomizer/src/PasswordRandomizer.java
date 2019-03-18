import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passwordLength;
    private Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String text = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        
        for(int i=0; i<passwordLength; i++) {
            int random = randomizer.nextInt(text.length());
            password += text.charAt(random);
        }
        
        return password;
    }
}
