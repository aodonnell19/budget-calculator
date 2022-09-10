import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Expense expense = new Expense();
        List<Expense> expenseList = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)){
            while(true) {
                System.out.println("Welcome to your Expenses Calculator");
                System.out.println();
                System.out.println("1) View list of expenses");
                System.out.println("2) Add an expense");
                System.out.println("3) View breakdown of total current expenses");
                System.out.println("4) Exit");
                System.out.println("Please select an option by number value:");
                double choice = input.nextDouble();

                if(choice == 1) {
                    System.out.println();
                    System.out.println("**********************************");
                    expense.getExpenses(expenseList);
                    System.out.println("**********************************");
                    System.out.println();
                }
                else if(choice == 2) {
                    System.out.println("What is the name of your expense?");
                    String expenseName = input.next().trim();
                    System.out.println("How many times does this expense occur per month?");
                    System.out.println("Please enter a number value: ");
                    BigDecimal frequency = input.nextBigDecimal();
                    System.out.println("What is the amount of the expense as a number?");
                    BigDecimal amount = input.nextBigDecimal();
                    expense.addExpenseToList(expenseName, frequency, amount, expenseList);
                }
                else if(choice == 3) {

                }
                else if(choice == 4) {
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("An error has occurred. Please read instructions carefully and try again.");
        }
    }

}
