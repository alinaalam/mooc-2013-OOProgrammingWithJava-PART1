import java.text.*;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }
    
    public boolean less(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        }
        if(this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        double totalMoney = getTotalMoney();
        double decrementedMoney = decremented.getTotalMoney();
        double difference = totalMoney - decrementedMoney; 
        
        if(difference >= 0.0) {
            DecimalFormat df = new DecimalFormat("0.00");
            String[] split = (df.format(difference)).split("\\.");
            return new Money(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        return new Money(0, 0);
    }
    
    private double getTotalMoney() {
        return Double.parseDouble(this.euros + "." + this.cents);
    }
            
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
