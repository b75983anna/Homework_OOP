package com.accenture.OOP;

public class Main {

    public static void main(String[] args) {


        Invoice invoice1 = new Invoice("gardenRake", "large", 3, 7);

        System.out.println("invoice1: " + invoice1.toString());

        System.out.println(invoice1.getInvoiceAmount(3, 7));
        System.out.println(invoice1.getInvoiceAmount(-2, 7));

    }
}
