package pl.accenture;

import java.util.Arrays;

public class TravelOffice {

    int i = 0;
    Customer[] customers = new Customer[2];


    public static void main(String[] args) {
        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);
        Date today = new Date(start);
        Adress adress = new Adress("Sklodowska", "90-001","Lodz");

        Customer customer = new Customer("Piotr");
        Trip trip = new Trip(start, end, "Katowice");
        customer.setAdress(adress);
        customer.assignTrip(trip);
        customer.getInfo();


    }

    public void addCustomer(Customer customer) {
        if (customers.length == i) {
//            Customer[] customer1 = new Customer[i+1];
            customers = Arrays.copyOf(customers, customers.length+1);
            customers[i] = customer;
            i++;
        } else {
            customers[i] = customer;
            i++;
        }


    }

}