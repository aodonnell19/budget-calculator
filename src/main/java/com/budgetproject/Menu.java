package com.budgetproject;

public class Menu {

    public void getMainMenu() {
        System.out.println();
        System.out.println("Welcome to your Budget Calculator");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1) Add an income or expense");
        System.out.println("2) View list of incomes and/or expenses");
        System.out.println("3) View financial breakdown");
        System.out.println("4) Exit");
        System.out.println("Please select an option by number value:");
    }

    public void getListMenu() {
        System.out.println();
        System.out.println("Would you like to view:");
        System.out.println("1) List of incomes");
        System.out.println("2) List of expenses");
        System.out.println("3) Both");
        System.out.println("Please select an option by number value:");
    }

    public void getAddMenu() {
        System.out.println();
        System.out.println("What would you like to add:");
        System.out.println("1) Income");
        System.out.println("2) Expense");
        System.out.println("3) Back");
        System.out.println("Please select an option by number value:");
    }
}
