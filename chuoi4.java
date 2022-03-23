import java.util.Scanner;

public class chuoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        System.out.println("Chuoi ban dau: " + input);

        String[] charArray = input.split(" ");

        for (String w : charArray)  {
            System.out.println(w);
        }

    }
}
