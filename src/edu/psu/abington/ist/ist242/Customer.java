/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 3/14/19
Last Date Changed: 3/29/2020
Rev:
 */

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;


public class Customer {

    // CLASS LEVEL VARIABLES - PROTECT THE DATA ---------------------------------------------------------------
    private int customerId;
    protected String customerName;
    private String customerPhoneNumber;

    // CONSTRUCTOR METHOD ------------------------------------------------------------------------------------
    public Customer() {
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

            // ANOTHER WAY OF WRITING THE PRINTED CUSTOMER INFORMATION
            /*System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.println("Customer Name: " + cust.getCustomerName());
            System.out.println("Customer Phone: " + cust.getCustomerPhoneNumber());*/
        }
    }





}



