import java.util.Scanner;


public class BTham {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		bai6();
	}

	public static void bai1 (String message) {
		System.out.println(message);
	}

	public static void bai2 () {
		Scanner sc = new Scanner (System.in);
		String message = sc.next();
		bai1(message);
	}

	public static void bai3 () {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String message = sc.next();

		for (int i = 0; i < n; i++) {
			bai1(message);
		}
	}

	public static void bai4 (float a, float b) {
		if(a==0) {
			if(b==0) {
				System.out.println("PT Vo so nghiem");
			} else {
				System.out.println("PT Vo nghiem");
			}
		} else {
			System.out.println("PT co nghiem " + (-b/a));
		}
	}

	public static void bai5 (float a, float b, float c) {
		if(a==0) {
			bai4(b, c);
		} else {
			float delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("PT Vo nghiem");
			} else if(delta == 0) {
				System.out.println("PT co nghiem kep "+ (-b/(2*a)));
			} else {
				System.out.println("X1 = " + (-b + Math.sqrt(delta))/(2*a));
				System.out.println("X1 = " + (-b - Math.sqrt(delta))/(2*a));
			}
		}
	}

	public static void bai6 (){
		float a, b, c;
		Scanner sc = new Scanner (System.in);
		System.out.println("1 - PTB1");
		System.out.println("2 - PTB2");
		int n = Math.abs(sc.nextInt());

		n = n % 2  + 1;

		switch(n) {
			case 1:
				a = sc.nextFloat();
				b = sc.nextFloat();
				bai4(a, b);
				break;
			case 2:
				a = sc.nextFloat();
				b = sc.nextFloat();
				c = sc.nextFloat();
				bai5(a, b, c);
				break;
		}
	}
}
