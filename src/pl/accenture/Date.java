package pl.accenture;

public class Date {
    private int year;
    private int month;
    private int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(Date xyz){
        year = xyz.year;
        month = xyz.month;
        day = xyz.day;
    }

    public String toString() {
        return "Rok:" + year + "\nMiesiac: " + month + "\nDzien: " + day + "\n" ;
    }
}


