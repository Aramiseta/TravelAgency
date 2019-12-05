package pl.accenture;

public class AbroadTrip extends Trip {
    double insurance;

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }

    public AbroadTrip(Date start, Date end, String destination, double insurance) {
        super(start, end, destination);
        this.insurance = insurance;
    }
}
