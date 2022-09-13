package com.budgetproject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Money expense = new Money();
        Money income = new Money();
        List<Money> expenseList = new ArrayList<>();
        List<Money> incomeList = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)){
            while(true) {
                menu.getMainMenu();
                double choice = Double.parseDouble(input.nextLine());

                if (choice == 1) {
                    while (true) {
                        menu.getAddMenu();
                        double addChoice = Double.parseDouble(input.nextLine());
                        if (addChoice == 1) {
                            System.out.println("What is the name of your income?");
                            String incomeName = input.nextLine().trim();
                            System.out.println("How many times does this income occur per month?");
                            System.out.println("Please enter a number value: ");
                            BigDecimal frequency = input.nextBigDecimal();
                            System.out.println("What is the amount of the income as a number?");
                            BigDecimal amount = input.nextBigDecimal();
                            input.nextLine();
                            expense.addMoneyToList(incomeName, frequency, amount, incomeList);
                        }
                        else if (addChoice == 2) {
                            System.out.println("What is the name of your expense?");
                            String expenseName = input.nextLine().trim();
                            System.out.println("How many times does this expense occur per month?");
                            System.out.println("Please enter a number value: ");
                            BigDecimal frequency = input.nextBigDecimal();
                            System.out.println("What is the amount of the expense as a number?");
                            BigDecimal amount = input.nextBigDecimal();
                            input.nextLine();
                            expense.addMoneyToList(expenseName, frequency, amount, expenseList);
                        }
                        else if (addChoice == 3) {
                            break;
                        }
                        else {
                            System.out.println("Please enter valid input.");
                        }
                    }
                }
                else if (choice == 2) {
                    menu.getListMenu();
                    double listChoice = Double.parseDouble(input.nextLine());
                    System.out.println();
                    System.out.println("**********************************");
                    if (listChoice == 1) {
                        System.out.println("Income:");
                        income.getMoniesList(incomeList);
                    }
                    else if (listChoice == 2) {
                        System.out.println("Expenses:");
                        expense.getMoniesList(expenseList);
                    }
                    else if (listChoice == 3) {
                        System.out.println("Income:");
                        income.getMoniesList(incomeList);
                        System.out.println();
                        System.out.println("Expenses:");
                        expense.getMoniesList(expenseList);
                    }
                    else {
                        System.out.println("Please enter valid input.");
                    }
                    System.out.println("**********************************");
                    System.out.println();
                }
                else if (choice == 3) {

                }
                else if (choice == 4) {
                    break;
                }
                else {
                    System.out.println("Please enter valid input.");
                }
            }
        }
        catch (Exception e) {
            System.out.println("An error has occurred. Please read instructions carefully and try again.");
        }
    }
}
