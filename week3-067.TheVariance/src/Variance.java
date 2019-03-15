import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int value : list) {
            sum += value;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (1.0 * sum(list) / list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list); 
        double variance = 0.0;

        for(int value : list) {
            variance += Math.pow((value - average), 2);
        } 
        
        return variance/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        
        System.out.println("The variance is: " + variance(list));
    }

}
