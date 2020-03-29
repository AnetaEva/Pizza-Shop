package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

enum PaymentType {cash, credit}

public class Transaction extends Customer{

    // CLASS LEVEL VARIABLES - PROTECT THE DATA  ---------------------------------------------------
    private int transactionId;
    private Order order;
    private PaymentType pType;
    private final double tax = 0.06; // adding the tax


    // CONSTRUCTOR METHOD --------------------------------------------------------------------------
    public Transaction() {
    }

    public Transaction(int _transactionId, Order _order, PaymentType _pType){
        this.transactionId = transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    public Transaction(int _transactionId) {
        this.transactionId = _transactionId;
    }

    // GETTERS AND SETTERS  ------------------------------------------------------------------------
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }


    public Order getOrder() {
        return order;
    }
    public void setOrder(Order _order) {
        this.order = _order;
    }


    public PaymentType getPaymentType() {
        return pType;
    }
    public void setPaymentType(PaymentType _pType) {
        this.pType = _pType;
    }

    // METHODS ------------------------------------------------------------------------------------
    public static void listTransactions(ArrayList<Transaction> tList){
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            //System.out.println("Order:" + trans.getOrder());  //TODO: Print order
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }

    public PaymentType selectPayType() { //this method selects the payment type cash or credit
        Scanner input = new Scanner(System.in);
        System.out.println("Enter payment type ('cash' / 'credit'): ");
        pType = PaymentType.valueOf(input.next().toLowerCase());
        // add if statement for cash payment to calculate change
        return pType;
    }

    public void printReceipt(double orderTotal, PaymentType pType){

        double total = orderTotal + orderTotal * tax;

        System.out.printf("%-10s  %-10s", "Order         ", "$ ");
        System.out.printf("%.2f\n", orderTotal);

        //double total = orderTotal + orderTotal * tax;

        System.out.printf("%-10s  %-10s", "Tax           ", "$ ");
        System.out.print(" ");
        System.out.printf("%.2f\n",tax * orderTotal);
        System.out.printf("%-10s  %-10s", "Total w/ tax  ", "$    ");
        System.out.printf("%.2f\n", total);
    }


}
