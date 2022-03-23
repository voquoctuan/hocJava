import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class chuoi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String input = scanner.nextLine();

        int counter = 0;

        System.out.println("Nhap vao tu can kiem tra: ");
        String tu = scanner.next();

        String[] charArray = input.split(" ");
        for (int i = 0; i < charArray.length; i++) {
            if(tu.equals(charArray[i])) {
                counter++;
                System.out.println("Xuat hien tai vi tri: " + i);
            }
        }

        System.out.println(tu + " xuat hien so lan: " + counter);
    }
}
