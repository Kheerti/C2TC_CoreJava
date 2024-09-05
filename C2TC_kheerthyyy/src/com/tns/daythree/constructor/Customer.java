package com.tns.daythree.constructor;



public class Customer {



    private String customerName;

    private int customerId;

    private String customerCity;



    // Default Constructor

    public Customer() {

        System.out.println("Default Constructor invoked");

    }



    // Parameterized Constructor with the use of this keyword

    public Customer(String customerName, int customerId, String customerCity) {

        this(); // Calling default constructor

        System.out.println("Parameterized Constructor invoked");

        this.customerName = customerName;

        this.customerId = customerId;

        this.customerCity = customerCity;

    }



    // Getters and Setters

    public String getCustomerName() {

        return customerName;

    }



    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }



    public int getCustomerId() {

        return customerId;

    }



    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }



    public String getCustomerCity() {

        return customerCity;

    }



    public void setCustomerCity(String customerCity) {

        this.customerCity = customerCity;

    }



    // Overriding toString() method

    @Override

    public String toString() {

        return "Customer [Customer Name=" + customerName + ", Customer Id=" + customerId + ", Customer City=" + customerCity + "]";

    }

}


