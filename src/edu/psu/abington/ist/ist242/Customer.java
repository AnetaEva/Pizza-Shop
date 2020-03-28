package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;


public class Customer {

    // CLASS LEVEL VARIABLES - PROTECT THE DATA ---------------------------------------------------------------
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    // CONSTRUCTOR METHOD ------------------------------------------------------------------------------------
    public Customer(){
    }

    public Customer(int _customerId) {
        this.customerId = _customerId;  // INCREMENTS THE ID COUNT
    }


    // SETTERS AND GETTERS -----------------------------------------------------------------------------------
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }

    // METHODS ------------------------------------------------------------------------------------------------



    // METHOD TO PRINT CUSTOMERS
    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.printf("%-10s | %-12s | %-10s\n", cust.getCustomerId(), cust.getCustomerName(), cust.getCustomerPhoneNumber());
        }
    }
}

