package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if(qualified) System.out.println("Congrats! You've been approved");
        else System.out.println("Sorry, you've been declined");
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        return salary;

    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if(salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        } else return false;
    }
}
