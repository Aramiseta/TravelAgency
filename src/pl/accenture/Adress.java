package pl.accenture;

public class Adress {
    private String street;
    private String zip;
    private String city;


    public Adress(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }



     public String toString(){
        return "Ulica " + street + "\nAdres pocztowy:" + zip + "\nMiasto:" + city + "\n";
    }
}
