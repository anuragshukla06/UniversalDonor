package com.example.universaldonor;

import java.util.ArrayList;

public class BloodBank {

    private String bankName;
    private BloodStats bloodStats;
    ArrayList<String> donations;
    private long mobileNumber;
<<<<<<<<< Temporary merge branch 1
    double latitude;
    double longitude;
    String address;
    String city;
    String state;

    public BloodBank(String bankName, BloodStats bloodStats, ArrayList<String> donations, long mobileNumber, double latitude, double longitude, String address, String city, String state) {
        this.bankName = bankName;
=========
    private double latitude;
    private double longitude;
    private String city;
    private String state;
    private String address;

    public BloodBank(String bankName, BloodStats bloodStats, Donations donations, long mobileNumber, double latitude, double longitude, String city, String state, String address) {
        BankName = bankName;
>>>>>>>>> Temporary merge branch 2
        this.bloodStats = bloodStats;
        this.donations = donations;
        this.mobileNumber = mobileNumber;
        this.latitude = latitude;
        this.longitude = longitude;
<<<<<<<<< Temporary merge branch 1
        this.address = address;
=========
        this.city = city;
        this.state = state;
        this.address = address;
    }

    public BloodBank(String bankName, BloodStats bloodStats, double latitude, double longitude, String city, String state) {
        BankName = bankName;
        this.bloodStats = bloodStats;
        this.latitude = latitude;
        this.longitude = longitude;
>>>>>>>>> Temporary merge branch 2
        this.city = city;
        this.state = state;
    }

    public String getBankName() {
        return bankName;
    }

    public BloodStats getBloodStats() {
        return bloodStats;
    }

    public ArrayList<String> getDonations() {
        return donations;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

<<<<<<<<< Temporary merge branch 1
    public String getAddress() {
        return address;
    }

=========
>>>>>>>>> Temporary merge branch 2
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
<<<<<<<<< Temporary merge branch 1
=========

    public String getAddress() {
        return address;
    }
>>>>>>>>> Temporary merge branch 2
}
