import java.util.Scanner;

public class testdata1 {
    public static void main (String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = input.nextInt();

        if(number < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is positive");
        }
    }
}