package com.budgetproject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MoneyTest {
    private BigDecimal total = new BigDecimal(0);
    private Money money = new Money();
    private List<Money> moneyList = new ArrayList<>();

    @Before
    public void initialize() {
        moneyList.clear();
    }

    @Test
    public void financialBreakdown_whenInputIsZero_shouldBeZero() {
        BigDecimal amount = new BigDecimal(0);
        BigDecimal frequency = new BigDecimal(2);
        BigDecimal timeAmount = new BigDecimal(4);
        BigDecimal expected = new BigDecimal("0.00");
        Money zero = new Money("zero", amount, frequency);

        moneyList.add(zero);

        total = money.financialBreakdown(timeAmount, moneyList);

        Assert.assertEquals(expected, total);
    }
}
