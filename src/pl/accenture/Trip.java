package pl.accenture;

public class Trip {
    Date start;
    Date end;
    String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }



    public String getInfo()
    {
        return "Poczatek wycieczki " + start.getInfo() + "\nKoniec wycieczki:" + end.getInfo() + "Destynacja: "
            + destination;

}
}
