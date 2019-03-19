
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        
        double priceOf1stApartment = calculatePrice(this);
        double priceOf2ndApartment = calculatePrice(otherApartment);
        
        return (int)Math.abs(priceOf1stApartment - priceOf2ndApartment);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return calculatePrice(this) > calculatePrice(otherApartment);
    }
    
    private double calculatePrice(Apartment apartment) {
        return apartment.squareMeters * apartment.pricePerSquareMeter;
    }
}
