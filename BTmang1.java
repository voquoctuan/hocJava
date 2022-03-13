import java.util.Scanner;


public class BTmang1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Nhap mang: ");
		nhapMang(array, n);
		xuatMang(array, n);

		System.out.println("\nTrung binh cong cua mang la: " + tbc(array, n));
	}
    // Hàm nhập mảng
    public static void nhapMang(int [] a, int n){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++) {
            a[i]= sc.nextInt();
        }
    }

    // Hàm xuất mảng
    public static void xuatMang(int[] a, int n){
        System.out.println("Mang vua nhap: ");
        for(int i=0;i<n;i++)
            System.out.print("\t"+ a[i]);

    }

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
