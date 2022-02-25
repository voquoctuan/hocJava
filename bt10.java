import java.util.Scanner;
public class bt10 {
    public static void main (String[] args) {
        String username = "HuyHoang";
        String password = "2021";
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap username de kiem tra: ");
        String u = sc.next();
        System.out.println("Nhap password de kiem tra: ");
        String p = sc.next();

        if(u.equals(username) && p.equals(password)) {
            System.out.println("Username va Password da dung");
        }else {
            System.out.println("Sai username hoac password");
        }
    }
}
