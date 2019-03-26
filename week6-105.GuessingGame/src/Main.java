
public class Main {
    public static void main(String[] args) {
        // test your program here
        GuessingGame game = new GuessingGame();
        game.play(1,40);
        System.out.println(game.isGreaterThan(32));
        System.out.println(game.average(3, 4));
    }    
}
