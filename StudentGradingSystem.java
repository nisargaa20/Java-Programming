import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int numSubjects;
    String[] subjects;
    int[] scores;
    char grade;

    public void inputDetails(Scanner scanner) {
        System.out.println("Enter student name:");
        name = scanner.nextLine();
        System.out.println("Enter student roll number:");
        rollNumber = scanner.nextInt();
        System.out.println("Enter number of subjects:");
        numSubjects = scanner.nextInt();
        scanner.nextLine(); 
        subjects = new String[numSubjects];
        scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter subject " + (i + 1) + " name:");
            subjects[i] = scanner.nextLine();
            System.out.println("Enter score for " + subjects[i] + ":");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
    }

    public void calculateGrade() {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        double averageScore = (double) totalScore / numSubjects;

        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else if (averageScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subjects and Scores:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + scores[i]);
        }
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subjects and Scores:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + scores[i]);
        }
        System.out.println("Overall Grade: " + grade);
        System.out.println();
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Student Grading System");

        while (true) {
            Student student = new Student();
            student.inputDetails(scanner);
            student.calculateGrade();
            student.displayResult();

            System.out.println("Do you want to input details for another student? (yes/no):");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
