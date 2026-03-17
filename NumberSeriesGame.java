import java.util.Scanner;

public class NumberSeriesGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[] questions = {
            "2 4 6 8 ?",
            "3 6 9 12 ?",
            "5 10 15 20 ?",
            "1 1 2 3 5 ?"
        };

        
        int[] answers = {10, 15, 25, 8};

        int score = 0;

        System.out.println("=== NUMBER SERIES GAME ===");
        System.out.println("Find the next number in the series");

        
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);
            System.out.print("Enter your answer: ");

            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score += 10; 
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer is: " + answers[i]);
            }
        }

        System.out.println("\nGame Over");
        System.out.println("\nYour Score: " + score);

        sc.close();
    }
}