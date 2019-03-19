
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        // get students info
        while(true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("student number: ");
            String studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));
        }
        
        // list all students
        for(Student student : list) {
            System.out.println(student);
        }
        
        // search for students
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        
        System.out.println("Result:");
        for(Student student : list) {
            if(student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
