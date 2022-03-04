import java.util.Scanner;
public class timsongay {


  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int songaycuathang = 0;
        String tencuathang = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                tencuathang = "January";
                songaycuathang = 31;
                break;
            case 2:
                tencuathang = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    songaycuathang = 29;
                } else {
                    songaycuathang = 28;
                }
                break;
            case 3:
                tencuathang = "March";
                songaycuathang = 31;
                break;
            case 4:
                tencuathang = "April";
                songaycuathang = 30;
                break;
            case 5:
                tencuathang = "May";
                songaycuathang = 31;
                break;
            case 6:
                tencuathang = "June";
                songaycuathang = 30;
                break;
            case 7:
                tencuathang = "July";
                songaycuathang = 31;
                break;
            case 8:
                tencuathang = "August";
                songaycuathang = 31;
                break;
            case 9:
                tencuathang = "September";
                songaycuathang = 30;
                break;
            case 10:
                tencuathang = "October";
                songaycuathang = 31;
                break;
            case 11:
                tencuathang = "November";
                songaycuathang = 30;
                break;
            case 12:
                tencuathang = "December";
                songaycuathang = 31;
        }
        System.out.print(tencuathang + " " + year + " has " + songaycuathang + " days\n");
    }
}