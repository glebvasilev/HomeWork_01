package com.company;

public class Main {
    /*
     *  Class serves for counting gas price, net and the envelope
     */

    public static void main(String[] args) {

    // the gasoline price
        double gasoline_price = 43.00;
        long amount = 50;
        double total_price = gasoline_price * amount;

        System.out.println("Gas price: " + total_price);

    // the net
        int gross = 70000;
        int tax = 13;
        double pay_tax = gross / 100 * tax;
        double net = gross - pay_tax;

        System.out.println("Net wages: " + net);

    // the envelope
        double seconds = 3600;
        double hour = seconds / 3600;

        System.out.println("Hours: " + hour);


    }
}

