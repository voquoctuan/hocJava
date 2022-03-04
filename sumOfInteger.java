import java.util.Scanner;

public class sumOfInteger {
    public static int DEC_10 = 10;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        System.out.println("The sum of all digits in " + num + " is " + totalDigitsOfNumber(num));

    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}
