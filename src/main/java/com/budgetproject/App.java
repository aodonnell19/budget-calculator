package com.budgetproject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Money money = new Money();
        List<Money> expenseList = new ArrayList<>();
        List<Money> incomeList = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)){
            Menu menu = new Menu(input);
            while(true) {
                menu.getMainMenu();
                if (menu.getChoice() == 1) {
                    while (true) {
                        menu.getAddMenu();
                        if (menu.getChoice() == 1) {
                            menu.getAddIncomeMenu();
                            money.addMoneyToList(menu.getNameInput(), menu.getFrequencyInput(), menu.getAmountInput(), incomeList);
                        }
                        else if (menu.getChoice() == 2) {
                            menu.getAddExpenseMenu();
                            money.addMoneyToList(menu.getNameInput(), menu.getFrequencyInput(), menu.getAmountInput(), expenseList);
                        }
                        else if (menu.getChoice() == 3) {
                            break;
                        }
                        else {
                            System.out.println("Please enter valid input.");
                        }
                    }
                }
                else if (menu.getChoice() == 2) {
                    while (true) {
                        menu.getListMenu();
                        System.out.println();
                        System.out.println("**********************************");
                        if (menu.getChoice() == 1) {
                            System.out.println("Income:");
                            money.getMoniesList(incomeList);
                        }
                        else if (menu.getChoice() == 2) {
                            System.out.println("Expenses:");
                            money.getMoniesList(expenseList);
                        }
                        else if (menu.getChoice() == 3) {
                            System.out.println("Income:");
                            money.getMoniesList(incomeList);
                            System.out.println();
                            System.out.println("Expenses:");
                            money.getMoniesList(expenseList);
                        }
                        else if (menu.getChoice() == 4) {
                            break;
                        }
                        else {
                            System.out.println("Please enter valid input.");
                        }
                        System.out.println("**********************************");
                        System.out.println();
                    }
                }
                else if (menu.getChoice() == 3) {
                    while (true) {
                        menu.getFinancialBreakdownMenu();
                        if (menu.getChoice() == 1) {

                        }
                        else if (menu.getChoice() == 2) {

                        }
                        else if (menu.getChoice() == 3) {

                        }
                        else if (menu.getChoice() == 4) {

                        }
                        else if (menu.getChoice() == 5) {
                            break;
                        }
                        else {
                            System.out.println("Please enter valid input.");
                        }
                    }
                }
                else if (menu.getChoice() == 4) {
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
