import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        final float PI = 3.14f;
        Scanner sc = new Scanner (System.in);
        float bankinh = sc.nextFloat();
        System.out.println("Chu vi hinh tron la " + (2*PI*bankinh));
        System.out.println("Dien tich hinh tron la: " + (PI*bankinh*bankinh));
    }
}