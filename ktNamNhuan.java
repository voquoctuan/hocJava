import java.util.Scanner;


public class ktNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = input.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + "is not a leap year.");
        }
    }
}