import java.util.*;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
        Scanner reader = new Scanner(System.in);
        System.out.println("? ");
        String command = reader.nextLine();
        
        Database birdWatchers = new Database();
        
        while(!command.contains("Quit")) {
            if(command.contains("Add")) {
                addCommand(reader, birdWatchers);
            }
            if(command.contains("Observation")) {
                observationCommand(reader, birdWatchers);
            }
            if(command.contains("Statistics")) {
                statisticsCommand(birdWatchers);
            }
            if(command.contains("Show")) {
                showCommand(reader, birdWatchers);
            }
            System.out.println("? ");
            command = reader.nextLine();
        }
            
    }
    
    public static void addCommand(Scanner reader, Database birdWatchers) {
        System.out.println("Name: ");
        String name = reader.nextLine();
        System.out.println("Latin Name: ");
        String latinName = reader.nextLine();
        birdWatchers.addBirds(name, latinName);
    }

    public static void observationCommand(Scanner reader, Database birdWatchers) {
        System.out.println("What was observed:? ");
        String observation = reader.nextLine();
        birdWatchers.recordObservation(observation);
    }
    
    public static void statisticsCommand(Database birdWatchers) {
        birdWatchers.showStatistics();
    }
    
    public static void showCommand(Scanner reader, Database birdWatchers) {
        System.out.println("What? ");
        String name = reader.nextLine();
        birdWatchers.showBird(name);
    }
}
