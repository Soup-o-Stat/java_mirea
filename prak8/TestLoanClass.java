import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        System.out.println("Created by Soup-o-Stat");
        Scanner input = new Scanner(System.in);

        System.out.print("Введите годовую процентную ставку, например, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Введите срок кредита в годах: ");
        int numberOfYears = input.nextInt();

        System.out.print("Введите сумму кредита в руб.: ");
        double loanAmount =  input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("Дата взятия кредита: " + loan.getLoanDate().toString());
        System.out.println("Ежемесячный платеж по кредиту равен " + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита равна " + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");
    }
}