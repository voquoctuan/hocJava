import java.util.Scanner;
public class slide24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();
        int result = number1 - number2;

        System.out.println("What is " + number1 + " - " + number2 + "?");
        System.out.println("Enter the answer: ");
        int answer = sc.nextInt();

        if(answer == result) {
            System.out.println("That correct answer");
        }else {
            System.out.println("No! It's wrong");
        }
    }
}
