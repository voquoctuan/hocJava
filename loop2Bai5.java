import java.util.Scanner;

/**
 * Chương trình liệt kê n số nguyên tố đầu tiên.
 *
 * @author viettuts.vn
 */
public class loop2Bai5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}