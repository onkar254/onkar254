import java.util.Scanner;

public class StudentCalculator {

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            return "A+";
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            return "A";
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            return "B";
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            return "C";
        } else if (averagePercentage >= 50 && averagePercentage < 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }

        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;
        String grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
