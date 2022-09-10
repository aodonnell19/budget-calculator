import java.math.BigDecimal;
import java.util.List;

public class Expense {

    private String name = "";
    private BigDecimal amount = new BigDecimal(0);
    private BigDecimal frequency = new BigDecimal(0);

    public Expense() {
    }

    public Expense(String name, BigDecimal frequency, BigDecimal amount) {
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

    public void addExpenseToList(String name, BigDecimal frequency, BigDecimal amount, List<Expense> expenseList) {
        Expense expense = new Expense(name, frequency, amount);
        expenseList.add(expense);
    }

    public String toString() {
        return getName() + ": $" + getAmount() + " -- " + getFrequency() + " times a month";
    }

    public void getExpenses(List<Expense> expenseList) {
        expenseList.forEach(expense -> System.out.println(expense.toString()));
    }
}
