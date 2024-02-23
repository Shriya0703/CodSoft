import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of Subjects");

        int nS = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= nS; i++) {
            System.out.println("Enter marks obtained in Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double averP = (double) total / nS;
        char grade;

        if (averP > 90) {
            grade = 'A';
        } else if (averP > 80) {
            grade = 'B';
        } else if (averP > 70) {
            grade = 'C';
        } else if (averP > 60) {
            grade = 'D';
        } else if (averP >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks Scored is " + total);
        System.out.println("Average Percentage Gained is " + averP + "%");
        System.out.println("Grade: " + grade);
    }
}