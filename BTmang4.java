import java.util.Scanner;


public class BTmang4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao so phan tu cua mang: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		sinhMang(arr, n);
		System.out.println("Mang sau khi sinh: " );
		xuatMang(arr, n);

		System.out.println("\nMang sau khi duyet Trai sang Phai: ");
		inTraiPhai(arr, n);

		System.out.println("\nMang sau khi duyet Phai sang Trai: ");
		inPhaiTrai(arr, n);
	}

	public static void xuatMang(int[] a, int n){
        System.out.println("Mang vua nhap: ");
        for(int i=0;i<n;i++)
            System.out.print("\t"+ a[i]);

    }

	public static void sinhMang(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 10);
		}
	}

	public static void inTraiPhai(int[] a, int n) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
		}
	}

	public static void inPhaiTrai(int[] a, int n) {
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print("\t" + a[i]);
		}
	}
}
