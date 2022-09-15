package com.budgetproject;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private double choice = 0;
    private String stringInput = "";
    private BigDecimal numInput = new BigDecimal(0);

    public Menu(Scanner input) {
        this.input = input;
    }

    public double getChoice() {
        return choice;
    }

    public void setChoice(double choice) {
        this.choice = choice;
    }

    public String getStringInput() {
        return stringInput;
    }

    public void setStringInput(String stringInput) {
        this.stringInput = stringInput;
    }

    public BigDecimal getNumInput() {
        return numInput;
    }

    public void setNumInput(BigDecimal numInput) {
        this.numInput = numInput;
    }

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
        setChoice(Double.parseDouble(input.nextLine()));
    }

    public void getListMenu() {
        System.out.println();
        System.out.println("Would you like to view:");
        System.out.println("1) List of incomes");
        System.out.println("2) List of expenses");
        System.out.println("3) Both");
        System.out.println("Please select an option by number value:");
        setChoice(Double.parseDouble(input.nextLine()));
    }

    public void getAddMenu() {
        System.out.println();
        System.out.println("What would you like to add:");
        System.out.println("1) Income");
        System.out.println("2) Expense");
        System.out.println("3) Back");
        System.out.println("Please select an option by number value:");
        setChoice(Double.parseDouble(input.nextLine()));
    }
}
