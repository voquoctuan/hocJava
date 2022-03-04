import java.util.Scanner;
import java.lang.Math;

public class loop2Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int num = sc.nextInt();

        System.out.println("Day so fibonacci la: " + Fibonacci(num));
    }

    public static long Fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
