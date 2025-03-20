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

        System.out.print("What is your current payment?: ");
        double payment = scanner.nextDouble();

        scanner.close();
        ui1.setRate(rate);
        ui1.setCurrentAmount(currentAmount);
        ui1.setPrincipal(principal);
        ui1.setPayment(payment);

        System.out.println(ui1);
    }
}