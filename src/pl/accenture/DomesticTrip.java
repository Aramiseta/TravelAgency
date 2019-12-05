package pl.accenture;

public class DomesticTrip extends Trip {

    private double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double ownArrivalDiscount) {
        super(start, end, destination);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }


    public double getPrice() {
        //return super.getPrice();
        return super.getPrice() - ownArrivalDiscount;
    }
}
