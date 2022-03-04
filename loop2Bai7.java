import java.util.Scanner;

public class loop2Bai7 {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen duong bat ki: ");
        n = scanner.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        System.out.println("Tong cac chu so = " + tong);
    }
}
