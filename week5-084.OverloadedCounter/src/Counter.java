/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alinaalam
 */
public class Counter {
    
    private int counter;
    private boolean check;
    
    public Counter() {
        this(0, false);
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }
    
    public int value() {
        return counter;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void increase(int increaseAmount) {
        if(increaseAmount > 0) {
            counter += increaseAmount;
        }
    }
    
    public void decrease() {
        decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        if(decreaseAmount > 0) {
            counter -= decreaseAmount;
            if(check && counter < 0) {
                counter = 0;
            }
        }
    }
}
