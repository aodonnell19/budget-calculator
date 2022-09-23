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
        final BigDecimal DAILY = new BigDecimal(30);
        final BigDecimal WEEKLY = new BigDecimal(1);
        final BigDecimal MONTHLY = new BigDecimal(4);
        final BigDecimal YEARLY = new BigDecimal(52);

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
                            BigDecimal totalDailyIncome = money.financialBreakdown(DAILY, incomeList);
                            BigDecimal totalDailyExpense = money.financialBreakdown(DAILY, expenseList);
                            System.out.println("Daily income: $" + totalDailyIncome);
                            System.out.println();
                            System.out.println("Daily expense: $" + totalDailyExpense);
                            System.out.println();
                            System.out.println("Yearly net income: $" + totalDailyIncome.subtract(totalDailyExpense));
                            System.out.println();
                        }
                        else if (menu.getChoice() == 2) {
                            BigDecimal totalWeeklyIncome = money.financialBreakdown(WEEKLY, incomeList);
                            BigDecimal totalWeeklyExpense = money.financialBreakdown(WEEKLY, expenseList);
                            System.out.println("Weekly income: $" + totalWeeklyIncome);
                            System.out.println();
                            System.out.println("Weekly expense: $" + totalWeeklyExpense);
                            System.out.println();
                            System.out.println("Yearly net income: $" + totalWeeklyIncome.subtract(totalWeeklyExpense));
                            System.out.println();
                        }
                        else if (menu.getChoice() == 3) {
                            BigDecimal totalMonthlyIncome = money.financialBreakdown(MONTHLY, incomeList);
                            BigDecimal totalMonthlyExpense = money.financialBreakdown(MONTHLY, expenseList);
                            System.out.println("Monthly income: $" + totalMonthlyIncome);
                            System.out.println();
                            System.out.println("Monthly expense: $" + totalMonthlyExpense);
                            System.out.println();
                            System.out.println("Yearly net income: $" + totalMonthlyIncome.subtract(totalMonthlyExpense));
                            System.out.println();
                        }
                        else if (menu.getChoice() == 4) {
                            BigDecimal totalYearlyIncome = money.financialBreakdown(YEARLY, incomeList);
                            BigDecimal totalYearlyExpense = money.financialBreakdown(YEARLY, expenseList);
                            System.out.println("Yearly income: $" + totalYearlyIncome);
                            System.out.println();
                            System.out.println("Yearly expense: $" + totalYearlyExpense);
                            System.out.println();
                            System.out.println("Yearly net income: $" + totalYearlyIncome.subtract(totalYearlyExpense));
                            System.out.println();
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
