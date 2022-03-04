import java.util.Scanner;

public class loopEx4 {
    public static void main(String[] string) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();

        System.out.println("The digits of number is " + digitNum(num));
    }

    public static int digitNum(int num) {
        int totalDigit = 0;
        do {
            num = num / 10;
            totalDigit++;
        }while(num > 0);
        return totalDigit;
    }
}
