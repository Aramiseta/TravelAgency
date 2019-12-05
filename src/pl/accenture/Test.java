package pl.accenture;

import java.util.Arrays;

public class Test {
    int i = 0;
    Customer[] customers = new Customer[2];

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();
        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);
        Date today = new Date(start);
        Adress adress = new Adress("Sklodowska", "90-001","Lodz");
        Trip domesticTrip = new DomesticTrip(start, end, "Katowice", 10);
        Trip abroadTrip = new AbroadTrip(start, end, "Pabianice", 10);
///////////////////////////////////////////////////////////////
        Customer customer = new Customer("Piotr");
        Trip trip = new Trip(start, end, "Katowice");
        Customer customer2 = new Customer("Adam");
        Adress adress2 = new Adress("Piekna", "95-600","Pabianice");

//////////////////////////////////////////////////////////////
        customer.setAdress(adress);
        customer.assignTrip(abroadTrip);
        System.out.println(customer.toString());
/////////////////////////////////////////////////////////////
        customer2.setAdress(adress2);
        customer2.assignTrip(domesticTrip);
        System.out.println(customer2.toString());
        domesticTrip.setPrice(100);
        abroadTrip.setPrice(300);

    }


    public void addCustomer(Customer customer) {
        if (customers.length == i) {

            customers = Arrays.copyOf(customers, customers.length+1);
            customers[i] = customer;
            i++;
        } else {
            customers[i] = customer;
            i++;
        }

    }
}
