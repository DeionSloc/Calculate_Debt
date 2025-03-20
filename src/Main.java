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
        double amount = scanner.nextDouble();

        System.out.print("What is your current payment?: ");
        double payment = scanner.nextDouble();

        ui1.setRate(rate);
        ui1.setCurrentAmount(currentAmount);
        ui1.setInitialAmount(amount);
        ui1.setPayment(payment);

        System.out.println(ui1);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        if(isStudent){
//            System.out.println("You are enrolled as a student");
//        }
//        else{
//            System.out.println("The fuck are you doing here?");
//        }
//        System.out.println("Hello " + name + " you are " + age + " years old" + " and you have a gpa of " + gpa);


    }
}