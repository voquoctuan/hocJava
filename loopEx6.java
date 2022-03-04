import java.util.Scanner;

public class loopEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if(i %2 == 0)
                continue;
            else
                System.out.print(i + " ");
        }
    }
}
