
import java.util.Scanner;

public class BTmang2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		//	Sinh mang ngau nhien
		sinhMang(array, n);
		xuatMang(array, n);

		System.out.println("\nTrung binh cong cua mang la: " + tbc(array, n));
	}

	//	ham sinh mang
	public static void sinhMang(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 10);
		}
	}
	//	ham xuat mang
	public static void xuatMang(int[] a, int n){
        System.out.println("Mang da cho: ");
        for(int i=0;i<n;i++)
            System.out.print("\t"+ a[i]);

    }

//	ham tinh trung binh cong
	public static float tbc(int[] a, int n) {
    	int sum = 0;
    	float tbcong = 0;
    	for (int i = 0; i < a.length; i++) {
    		sum += a[i];
    	}
    	tbcong = (float)sum/n;
    	return tbcong;
    }
}
