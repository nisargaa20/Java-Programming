import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

      
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("This quiz covers basic Java concepts.");

        System.out.println("\nQuestion 1: What does JDK stand for?");
        System.out.println("a) Java Development Kit");
        System.out.println("b) Java Runtime Environment");
        System.out.println("c) Java Virtual Machine");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("\nQuestion 2: What will be printed?");
        System.out.println("int x = 5; double y = 2.5;");
        System.out.println("System.out.println(x + y);");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("7.5")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("\nQuestion 3: If it's raining, should you take an umbrella?");
        System.out.println("a) Yes");
        System.out.println("b) No");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }

 
        System.out.println("\nQuestion 4: Is 10 greater than 5?");
        System.out.println("a) Yes");
        System.out.println("b) No");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect.");
        }


        System.out.println("\nYour score: " + score + "/4");
        if (score == 4) {
            System.out.println("Perfect! You got all questions correct.");
        } else if (score >= 2) {
            System.out.println("Well done!");
        } else {
            System.out.println("You can do better. Keep practicing!");
        }
    }
}
