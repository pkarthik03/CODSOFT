import java.util.Scanner;

public class CalculatePercentageAndGradeWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Define an array to store marks for the subjects
        double[] subjects = new double[numSubjects];

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextDouble();
        }

        // Calculate the total marks
        double totalMarks = 0;
        for (double mark : subjects) {
            totalMarks += mark;
        }

        // Calculate the percentage
        double percentage = (totalMarks / (numSubjects * 100)) * 100;

        // Display the percentage
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade using a switch statement
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
