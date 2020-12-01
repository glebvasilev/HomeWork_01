package com.company;

public class Main {

    public static void main(String[] args) {
	// the cost of gasoline
        double price = 42.50;
        int volume = 50;
        double money = price * volume;

        System.out.println(money);

    // the net pay
        int gross_pay = 70000;
        int tax = 13;
        double pay_tax = gross_pay / 100 * tax;
        double net_pay = gross_pay - pay_tax;

        System.out.println(net_pay);

    // the envelope
        double seconds = 3600;
        int minute_per_hour = 60;
        double hour = seconds / minute_per_hour;

        System.out.println(hour + " min");


    }
}
