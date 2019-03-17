
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        // code here
        sum += number;
        amountOfNumbers++;
    }

    public int sum() {
        return sum;
    }
    
    public double average() {
        if(amountOfNumbers > 0)
            return sum*1.0/amountOfNumbers;
        return 0;
    }
    
    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
}
