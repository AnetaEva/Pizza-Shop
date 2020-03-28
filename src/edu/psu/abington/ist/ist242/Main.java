/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 3/14/19
Last Date Changed: 3/28/2020
Rev:
 */

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    int cCount = 1;

    public static void main(String[] args) {

        // CREATE A MAIN DEFAULT CONSTRUCTOR WITH NO ARGUMENTS
        Main main = new Main();

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDER_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char CUST_PRNT = 'P';
        final char HELP_CODE = '?';
        char userAction;

        // CREATE INSTANCES OF EACH ARRAYLIST ---------------------------------------------------------------
        // this will be imported from the customer class because of the same package
        ArrayList<Customer> cList = new ArrayList<>(); // CUSTOMER ARRAYLIST










        // ----------------------------------------------------------------------------------------------------

        // MAIN MENU OF OPTIONS
        System.out.println("----------------------------------------------------------------------");
        System.out.println("                                                                      ");
        System.out.println("                  Welcome to Aneta's Pizza Shop                       ");
        System.out.println("                                                                      ");
        System.out.println("----------------------------------------------------------------------");

        final String PROMPT_ACTION = "\nMAIN MENU: \nC - Add Customer\nP - Print Customers\nM - See Menu\nO - Place an Order\nT - List Transaction\nE - Exit\n ";

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE :
                    cList.add(main.addCustomer()); // main object / addCustomer is in the main object so we are saying that do the addCustomer function from the main class and add it into the cList array
                    System.out.println(" ");
                    System.out.println("-- Customer saved. Please choose next option. --");
                    break;
                case CUST_PRNT: // PRINTS THE CUSTOMERS FROM CLIST, THAT YOU HAD ADDED
                    System.out.printf("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number");
                    Customer.printCustomer(cList);
                    break;
                case MENU_CODE : //Menu.listMenu(mList);
                    break;
                case ORDER_CODE : //Order.addOrders
                    break;
                case TRAN_CODE: //Transaction.listTransactions(tList);
                    break;
                case HELP_CODE:
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }


    // METHOD TO GET USER CHOICE FOR MENU --------------------------------------------------------------------
    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    // METHOD TO ADD CUSTOMERS --------------------------------------------------------------------------------
    public Customer addCustomer(){
        Customer cust = new Customer(cCount++); // create Customer object and add the cCount to increment each ID
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }



}
