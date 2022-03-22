import java.util.Scanner;

public class chuoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        System.out.println("Chuoi ban dau: " + input);

        char[] Array = input.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < Array.length; i++) {
            if(Character.isLetter(Array[i])) {
                if(foundSpace) {
                    Array[i] = Character.toUpperCase(Array[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }

        input = String.valueOf(Array);
        System.out.println("Chuoi sau khi doi: " + input);
    }

}
