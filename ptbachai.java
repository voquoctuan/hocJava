import java.util.Scanner;
public class ptbachai {
    public static void main(String[] agrs) {
        int a, b, c;
        double x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        b = scanner.nextInt();
        System.out.println("Nhap so c: ");
        c = scanner.nextInt();
        giaiPTbac2(a, b, c);
    }

    public static void giaiPTbac2(int a, int b, int c) {
        if(a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem x = " + (-c/b));
            }
        } else {
            int Delta = b*b - 4*a*c;
            double x1;
            double x2;
            if (Delta > 0) {
                x1 = (double) ((-b + Math.sqrt(Delta)) / (2*a));
                x2 = (double) ((-b - Math.sqrt(Delta)) / (2*a));
                System.out.println("Phuong trinh co 2 nghiem la: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (Delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }
    }
}