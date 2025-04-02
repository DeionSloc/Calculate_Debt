import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        // User_Information ui1 = new User_Information();
        System.out.print("How many loans are you checking?: ");
        int numLoans = scanner.nextInt();

        for(i = 0; i < numLoans; i++){
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
 
        System.out.printf("This is the principal of the loan: %.2f, this is the current balance $%.2f, this is the rate: %.2f, and this is the life of the loan: %d. Your current monthly payment is $%.2f and the total amount you will pay over the life of the loan is $%.2f\n", principal, balance, rate, years, monthlyPayment, totalPayment);
        System.out.printf("If you add an extra $%.2f to the payment, you will fully pay off your loan in %.0f months. The total amount you will pay will be $%.2f \n", extra, months, expeditedPayment);
        }
                
        scanner.close();
        // ui1.setYears(years);
        // ui1.setRate(rate);
        // ui1.setBalance(balance);
        // ui1.setPrincipal(principal);
        // ui1.setExtra(extra);

        // System.out.println(ui1);
    }
}