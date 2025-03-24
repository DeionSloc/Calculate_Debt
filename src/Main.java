import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User_Information ui1 = new User_Information();

        System.out.print("What is your current rate?: ");
        double rate = scanner.nextDouble();

        System.out.print("What is the remaining balance?: ");
        double currentAmount = scanner.nextDouble();

        System.out.print("What was the initial loan/debt amount?: ");
        double principal = scanner.nextDouble();

        System.out.print("What's the length of the loan in years?: ");
        int years = scanner.nextInt();

        scanner.close();
        ui1.setYears(years);
        ui1.setRate(rate);
        ui1.setBalance(currentAmount);
        ui1.setPrincipal(principal);

        System.out.println(ui1);
    }
}