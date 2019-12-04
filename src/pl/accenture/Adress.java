package pl.accenture;

public class Adress {
    String street;
    String zip;
    String city;

    public Adress(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }



    public String getInfo(){
        return "Ulica " + street + "\nAdres pocztowy:" + zip + "\nMiasto:" + city + "\n";
    }
}
