package com.budgetproject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Money {

    private String name = "";
    private BigDecimal amount = new BigDecimal(0);
    private BigDecimal frequency = new BigDecimal(0);

    public Money() {
    }

    public Money(String name, BigDecimal frequency, BigDecimal amount) {
        this.name = name;
        this.frequency = frequency;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFrequency() {
        return frequency;
    }

    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }

    public void addMoneyToList(String name, BigDecimal frequency, BigDecimal amount, List<Money> moneyList) {
        Money money = new Money(name, frequency, amount);
        moneyList.add(money);
    }

    public String toString() {
        return getName() + ": $" + getAmount() + " -- " + getFrequency() + " time(s) a month";
    }

    public void getMoniesList(List<Money> moneyList) {
        moneyList.forEach(money -> System.out.println(money.toString()));
    }

    public BigDecimal financialBreakdown(BigDecimal timeAmount, List<Money> moneyList) {
        BigDecimal total = new BigDecimal(0);
        BigDecimal daily = new BigDecimal(30);
        for (Money money:moneyList) {
            total = total.add(money.getAmount().multiply(money.getFrequency()));
        }
        total = total.divide(daily, 2, RoundingMode.CEILING);
        return total.multiply(timeAmount);
    }
}
