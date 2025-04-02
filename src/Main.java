import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User_Information ui1 = new User_Information();

        System.out.print("What is your current rate?: ");
        double rate = scanner.nextDouble();

        System.out.print("What is the remaining balance?: ");
        double balance = scanner.nextDouble();

        System.out.print("What is the principal?: ");
        double principal = scanner.nextDouble();

        System.out.print("What's the length of the loan in years?: ");
        int years = scanner.nextInt();

        System.out.print("What's the amount you're putting in on top of the  minimum payment?: ");
        double extra = scanner.nextDouble();

        double monthlyInterestRate = rate / 1200;

        double monthlyPayment = principal * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));

        double extraPayment = monthlyPayment + extra;

        double monthlyInterest = monthlyInterestRate * balance;

        double totalPayment = (monthlyPayment * 12) * years;

        double months = balance / extraPayment;

        double expeditedPayment = (extraPayment * months) + (months * monthlyInterest);

        System.out.printf("This is the principal of the loan: %.2f, this is the current balance $%.2f, this is the rate: %.2f, and this is the life of the loan: %d\n", principal, balance, rate, years);
        System.out.printf("This is your current monthly payment: $%.2f, this is the monthly interest: $%.2f. Paying an extra $%.2f with your current balance shortens the life of the loan to %.0f months.\n", monthlyPayment, monthlyInterest, extra, months);
        System.out.printf("This is the amount you will pay over the life of the loan %.2f and if you choose to put in extra, this is how much you will pay %.2f", totalPayment, expeditedPayment);


        scanner.close();
        // ui1.setYears(years);
        // ui1.setRate(rate);
        // ui1.setBalance(balance);
        // ui1.setPrincipal(principal);
        // ui1.setExtra(extra);

        // System.out.println(ui1);
    }
}