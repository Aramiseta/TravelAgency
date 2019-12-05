package pl.accenture;

public class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }



    public String toString()
    {
        return "\nPoczatek wycieczki " + start.toString() + "\nKoniec wycieczki: " + end.toString() + "\nDestynacja: "
            + destination + "\nCena " + getPrice();

}
}
