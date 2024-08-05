package decision_structure;

import java.util.Scanner;

public class GradeMessage_switchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job, give it another shot!";
            case "D" -> "You need to work a bit harder!";
            case "F" -> {
                System.out.println("Uh oh!");
                yield "You can definitely do better!";
            }
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
