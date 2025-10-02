package com.pluralsight;

public class CellPhone {
    private String model;
    private String phoneNumber;
    private String serialNumber;
    private String carrier;
    private String owner;

    public CellPhone(String phoneNumber, String model, String carrier, String owner, String serialNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.owner = owner;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }
    public void dial(String numberBeingDialed) {
        System.out.println(getOwner() + " is dialing: " + numberBeingDialed);
    }


}
