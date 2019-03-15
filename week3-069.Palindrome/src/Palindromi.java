import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        return text.equals(reverseString(text));
    }
    
    public static String reverseString(String text) {
        String word = "";
        
        for(int i=text.length() - 1; i>=0; i--) {
            word += text.charAt(i);
        }
        
        return word;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
