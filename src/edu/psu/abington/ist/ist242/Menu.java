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

public class Menu {

    // CLASS LEVEL VARIABLES - PROTECT THE DATA
    private int menuId;
    private String menuItem;
    private double price;
    //protected ArrayList menuList;


    // CONSTRUCTOR METHOD --------------------------------------------------------------------------------------
    public Menu(int _menuId, String _menuItem, double _price){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.price = _price;
    }

    // SETTERS AND GETTERS ------------------------------------------------------------------------------------
    public int getmenuId() {
        return menuId;
    }
    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }


    public double getPrice(){
        return price;
    }
    public void setPrice(double _price){
        this.price = _price;
    }


    public String getMenuItem() {
        return menuItem;
    }
    public void setMenuItem(String _menuItem) {
        this.menuItem = _menuItem;
    }






    // METHODS -----------------------------------------------------------------------------------------------------
    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getMenuItem());
        }
    }

    // THIS PRINTS THE STUFF BETWEEN THE LINES OF THE MENU ITEMS / id #, item name, price
    public Menu printMenuInfo() { // () no arguments
        System.out.printf("%-1s | %-12s | %-12s\n", menuId, menuItem, "$" + price);
        return null;

    }
}
