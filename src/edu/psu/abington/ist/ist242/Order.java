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

public class Order {

    int cCount = 0; // we want another int count in here so that the orders are numbered with an ID

    // CLASS LEVEL VARIABLES - PROTECT THE DATA
    private Customer cust;
    private Menu menu;
    private ArrayList<Menu> menuItem;
    private int orderId;
    private int menuID;
    private int custID;
    private int quantity;
    private double price;
    private double totalPrice;
    private double subTotal;
    private double orderTotal = 0; // order total is set to 0

    // CONSTRUCTOR METHOD --------------------------------------------------------------------------------------
    public Order(){
    }
    public Order order() {
        Order ord1 = new Order(cCount++);
        return ord1;
    }
    public Order(int _orderId){ // constructor overloading
        this.orderId = _orderId;
    }
    public Order(int _orderId, double _totalPrice) { // constructor overloading
        this.orderId = _orderId;
        this.price = _totalPrice;
    }


    // SETTERS AND GETTERS -------------------------------------------------------------------------------------
    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }


    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getMenuID() {
        return menuID;
    }
    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }


    public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }


    public int getQuantity() {
        /*Scanner input = new Scanner(System.in);
        quantity = input.nextInt();*/
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


    public double getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }


    // METHODS -------------------------------------------------------------------------------------------------

    public double getSubtotal(double price, double quantity) { // Subtotal is for when you order 1 item at a time, to get the subtotal you take the price * quantity so we need to indicate that in arguments
        double subTotal = price * quantity;
        return subTotal;
    }

    public double getOrderTotal(double subTotal) {
        System.out.println("$ " + subTotal);
        orderTotal = orderTotal + subTotal; // ordertotal is set at 0, PLUS the subtotal gives you the final ordertotal
        return orderTotal;
    }

    public void printOrder(String menuItem, double price, int quantity, double subtotal) { // this is printed in each CASE
        System.out.println(menuItem + " $" + price + " * " +  quantity + " = " + "$ " + subtotal); //ord.printOrder(menu1.getMenuItem(), menu1.getPrice(), qty, subTotal);
    }

    // PRINT ORDER DETAILS
    public static void listOrderDetails(ArrayList<Order> oList) { // listorderdetails takes the olist array as a parameter
        for (Order orderDetails : oList) { // olist array stored in orderdetails
            System.out.println(orderDetails.getMenuItem());// getOrderId()); //print the orderdetails by orderid
        }
    }
}



