import java.util.Scanner;
public class nguyenam {


  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String s = input.next().toLowerCase();

        boolean uppercase = s.charAt(0) >= 65 && s.charAt(0) <= 90;
        boolean lowercase = s.charAt(0) >= 97 && s.charAt(0) <= 122;
        boolean vowels = s.equals("a") || s.equals("e") || s.equals("i")
                || s.equals("o") || s.equals("u");

        if (s.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}