import java.lang.StringBuilder;
import java.util.Scanner;

public class chuoi7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder str = new StringBuilder(input);

        System.out.println(str.reverse().toString());

    }
}
