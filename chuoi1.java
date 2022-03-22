import java.util.Scanner;

public class chuoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Chuoi ban dau: " + input);

        input = input.replaceAll(" ", "");
        System.out.println("Chuoi sau khi xoa khoang trang: " + input);
    }
}
