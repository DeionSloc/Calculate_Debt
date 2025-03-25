import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User_Information ui1 = new User_Information();

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

        scanner.close();
        ui1.setYears(years);
        ui1.setRate(rate);
        ui1.setBalance(balance);
        ui1.setPrincipal(principal);
        ui1.setExtra(extra);

        System.out.println(ui1);
    }
}