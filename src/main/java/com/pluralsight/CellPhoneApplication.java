package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone("111", "Iphone", "Verizon", "Dave", "1234567890");
        CellPhone phone2 = new CellPhone("222", "Galaxy", "AT&T", "Jim", "0987654321");
        display(phone1);
        display(phone2);
        phone1.dial(phone2.getOwner());
        phone2.dial(phone1);



    }
    public static void display(CellPhone phone1) {
        System.out.println("Phone number is: " + phone1.getphoneNumber() + "\nModel is: " + phone1.getModel() + "\nCarrier is: " + phone1.getCarrier() + "\nOwner is: " + phone1.getOwner() + "\nSerial number is: " + phone1.getSerialNumber());

    }



}
