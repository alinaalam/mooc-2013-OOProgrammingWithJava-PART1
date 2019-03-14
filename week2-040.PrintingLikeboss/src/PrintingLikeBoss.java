public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int spaces = size - 1;
        int stars = 1;
        
        while(stars <= size) {
            printWhitespaces(spaces);
            printStars(stars);
            stars++;
            spaces--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        // odd number of stars and even number of spaces
        int stars = 1;
        int spaces = height - 1;
        int tempHeight = height;
        
        // height
        while(tempHeight > 0) {
            printWhitespaces(spaces);
            printStars(stars);
            stars+= 2;
            spaces--;
            tempHeight--;
        }
        
        // stand
        int middle = height - 1;
        for(int i=0; i<2; i++) {
            printWhitespaces(middle - 1);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
