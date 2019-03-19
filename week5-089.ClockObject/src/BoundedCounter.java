
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int counter;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.counter = 0;
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int value) {
        if(value > 0 && (this.counter + value) <= this.upperLimit) {
            this.counter += value;
        }
    }
    
    public int getValue() {
        return this.counter;
    }
    
    public void next() {
        this.counter++;
        if(this.counter > upperLimit) {
            this.counter = 0;
        }
    }
    
    public String toString() {
        String result = String.valueOf(this.counter);
        if(this.counter < 10) {
            result = "0" + result;
        }
        return result;
    }
}
