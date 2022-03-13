import java.util.Scanner;


public class BTmang3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		double[] b = new double[n];

		System.out.println("Sinh mang nguyen a: ");
		sinhMangNguyen(a, n);
		for(int i = 0; i < n; i++) {
			System.out.println("\t" + a[i]);
		}

		System.out.println("Sinh mang thuc b: ");
		sinhMangThuc(b, n);
		for(int i = 0; i < n; i++) {
			System.out.println("\t" + b[i]);
		}

		double tbts = (tonga(a, n)*tongb(b, n))/n;

		System.out.println("Trung binh trong so: " + tbts);

	}

	public static void sinhMangNguyen(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 10);
		}
	}

	public static void sinhMangThuc(double[] b, int n) {
		for(int i = 0; i < n; i++) {
			b[i] = Math.random();
		}
	}

	public static int tonga(int[] a, int n) {
    	int suma = 0;
    	for (int i = 0; i < a.length; i++) {
    		suma += a[i];
    	}
    	return suma;
    }

	public static double tongb(double[] b, int n) {
    	int sumb = 0;
    	for (int i = 0; i < b.length; i++) {
    		sumb += b[i];
    	}
    	return sumb;
    }
}
