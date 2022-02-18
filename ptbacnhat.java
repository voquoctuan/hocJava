import java.text.DecimalFormat;
import java.util.Scanner;

public class ptbacnhat {

    public static void main(String[] args) {
        int a, b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            nghiem = (double) -b / a;
            System.out.println("Phuong trinh co nghiem x = " + decimalFormat.format(nghiem));
        }
    }
}