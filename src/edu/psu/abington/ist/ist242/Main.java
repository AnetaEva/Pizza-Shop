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

        double subTotal;
        double orderTotal = 0;

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
        // this will be imported to the customer class because of the same package
        ArrayList<Customer> cList = new ArrayList<>(); // CUSTOMER ARRAYLIST






        //----------------------------------------------------------------------------------------------------
        ArrayList<Menu> mList = new ArrayList<>(); // MENUITEM ARRAYLIST

        // CREATE DEFAULT CONSTRUCTORS OF EACH MENU AND ADD MENUID, ITEMNAME, PRICE
        Menu menu1 = new Menu(1, "Plain", 11.99);
        mList.add(menu1); // ADD EACH MENU ITEMNAME, ID, PRICE TO THE ARRAYLIST

        Menu menu2 = new Menu(2, "Meat",  12.99);
        mList.add(menu2); // ADD EACH MENU ITEMNAME, ID, PRICE TO THE ARRAYLIST

        Menu menu3 = new Menu(3, "Extra", 14.99);
        mList.add(menu3); // ADD EACH MENU ITEMNAME, ID, PRICE TO THE ARRAYLIST

        Menu menu4 = new Menu(4, "Veg", 13.99);
        mList.add(menu4); // ADD EACH MENU ITEMNAME, ID, PRICE TO THE ARRAYLIST




        //-----------------------------------------------------------------------------------------------------
        ArrayList<Order> oList = new ArrayList<>(); //ORDER ARRAYLIST

        // CREATE A DEFAULT ORDER CONSTRUCTOR AND ADD THE ORDER ID INTO IT
        Order order1 = new Order(1);
        oList.add(order1);











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
                    System.out.printf("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number"); // i WANT THE INFO TO PRINT OUT HOW i HAVE IT IN THE PRINTCUSTOMER METHOD SO i HAVE TO INDICATE THAT HERE
                    Customer.printCustomer(cList);
                    break;
                case MENU_CODE :
                    System.out.println("------------------------");
                    System.out.println("     Pizza Shop Menu    ");
                    System.out.println("------------------------");
                    System.out.printf("%-1s | %-12s | %-12s\n", "ID", "Item", "Price");
                    //Menu.listMenu(cList); I want my menu from above to print the ID, Item and Price but it will call the printMenuInfo method from MENU
                    menu1.printMenuInfo(); // MENUID, ITEMNAME AND PRICE WILL PRINT
                    menu2.printMenuInfo(); // MENUID, ITEMNAME AND PRICE WILL PRINT
                    menu3.printMenuInfo(); // MENUID, ITEMNAME AND PRICE WILL PRINT
                    menu4.printMenuInfo(); // MENUID, ITEMNAME AND PRICE WILL PRINT
                    break;
                case ORDER_CODE : //Order.addOrders
                    Order ord = new Order();
                    System.out.println("-- ORDERING -- ");
                    String userInput = "1 - Order\n2 - Exit ";
                    userAction = getAction(userInput);
                    while (userAction != '2') {
                        Scanner input = new Scanner(System.in);
                        System.out.printf("%-1s | %-12s | %-12s\n", "ID", "Item", "Price"); // when the customer is set to order first the menu will print out
                        menu1.printMenuInfo();
                        menu2.printMenuInfo();
                        menu3.printMenuInfo();
                        menu4.printMenuInfo();
                        System.out.println(" ");
                        System.out.println("Please enter the menu ID # you would like to order: ");
                        int menuId = input.nextInt(); // takes the input and stores it in menuID
                        System.out.println("Enter the quantity: ");
                        int qty = input.nextInt(); //ord.getQuantity(); // takes the input qty and stores it in qty

                        ord.setQuantity(qty); // qty is set in ORD

                        oList.add(ord.order()); //adds the order to the order list

                        switch (menuId) {
                            case 1:
                                subTotal = ord.getSubtotal(menu1.getPrice(), qty);
                                orderTotal = orderTotal + subTotal;
                                ord.printOrder(menu1.getMenuItem(), menu1.getPrice(), qty, subTotal); //to print the order its going to print the menuItem name, print the price of the menu item, print the input how many you wanted and print the subtotal / this calculation comes from the Order class (printOrder)
                                userAction = getAction(userInput);
                                break;
                            case 2:
                                subTotal = ord.getSubtotal(menu2.getPrice(), qty);
                                orderTotal = orderTotal + subTotal;
                                ord.printOrder(menu2.getMenuItem(), menu1.getPrice(), qty, subTotal);
                                userAction = getAction(userInput);
                                break;
                            case 3:
                                subTotal = ord.getSubtotal(menu3.getPrice(), qty);
                                orderTotal = orderTotal + subTotal;
                                ord.printOrder(menu3.getMenuItem(), menu3.getPrice(), qty, subTotal);
                                userAction = getAction(userInput);
                                break;
                            case 4:
                                subTotal = ord.getSubtotal(menu4.getPrice(), qty);
                                orderTotal = orderTotal + subTotal;
                                ord.printOrder(menu4.getMenuItem(), menu4.getPrice(), qty, subTotal);
                                userAction = getAction(userInput);
                                break;
                            default:
                                System.out.println("Error.");
                                break;
                        }
                    }
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
