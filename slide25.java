import java.util.Scanner;

public class slide25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BMI: ");
        float BMI = sc.nextFloat();
        if(BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI >= 25.0 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
