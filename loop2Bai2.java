import java.util.Scanner;

public class loop2Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();

        System.out.println("Giai thua cua " + num + " la: " + giaithua(num));

    }

    public static long  giaithua(int n) {
        if(n==0 || n==1) return 1;
        return n*giaithua(n-1);
    }
}
