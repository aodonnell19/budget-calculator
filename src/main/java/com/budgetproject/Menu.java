package com.budgetproject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner input;
    private double choice = 0;
    private String nameInput = "";
    private BigDecimal frequencyInput = new BigDecimal(0);
    private BigDecimal amountInput = new BigDecimal(0);

    public Menu(Scanner input) {
        this.input = input;
    }

    public double getChoice() {
        return choice;
    }

    public void setChoice(double choice) {
        this.choice = choice;
    }

    public String getNameInput() {
        return nameInput;
    }

    public void setNameInput(String nameInput) {
        this.nameInput = nameInput;
    }

    public BigDecimal getFrequencyInput() {
        return frequencyInput;
    }

    public void setFrequencyInput(BigDecimal frequencyInput) {
        this.frequencyInput = frequencyInput;
    }

    public BigDecimal getAmountInput() {
        return amountInput;
    }

    public void setAmountInput(BigDecimal amountInput) {
        this.amountInput = amountInput;
    }

    public void getMainMenu() {
        System.out.println();
        System.out.println("Welcome to your Budget Calculator");
        System.out.println();
        System.out.println("What would you like to do:");
        System.out.println("1) Add an income or expense");
        System.out.println("2) View list of incomes and/or expenses");
        System.out.println("3) View financial breakdown options");
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
        System.out.println("4) Back");
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

    public void getAddIncomeMenu() {
        System.out.println("What is the name of your income?");
        setNameInput(input.nextLine().trim());
        System.out.println("How many times does this income occur per month?");
        System.out.println("Please enter a number value: ");
        setFrequencyInput(input.nextBigDecimal());
        System.out.println("What is the amount of the income as a number?");
        setAmountInput(input.nextBigDecimal());
        input.nextLine();
    }

    public void getAddExpenseMenu() {
        System.out.println("What is the name of your expense?");
        setNameInput(input.nextLine().trim());
        System.out.println("How many times does this expense occur per month?");
        System.out.println("Please enter a number value: ");
        setFrequencyInput(input.nextBigDecimal());
        System.out.println("What is the amount of the expense as a number?");
        setAmountInput(input.nextBigDecimal());
        input.nextLine();
    }

    public void getFinancialBreakdownMenu() {
        System.out.println("Which breakdown would you like to view:");
        System.out.println("1) Daily");
        System.out.println("2) Weekly");
        System.out.println("3) Monthly");
        System.out.println("4) Yearly");
        System.out.println("5) Back");
        setChoice(Double.parseDouble(input.nextLine()));
    }
}
