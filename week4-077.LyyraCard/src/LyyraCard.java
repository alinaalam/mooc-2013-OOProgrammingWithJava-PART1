/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alinaalam
 */
public class LyyraCard {
    
    private double balance;
    
    public LyyraCard(double balance) {
        this.balance = balance;
    }
    
    public void payEconomical() {
        // write code here
        if(this.balance - 2.5 >= 0) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        // write code here
        if(this.balance - 4.0 >= 0) {
            this.balance -= 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        // write code here
        if(amount > 0) {
            this.balance += amount;
            if(this.balance > 150) {
                this.balance = 150;
            }
        }
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
