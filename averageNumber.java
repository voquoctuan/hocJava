import java.util.Scanner;


public class averageNumber {
	public static void main(String[] args) {
		int i,n=0,sum=0;
		double avg;
		System.out.println("Input the 5 numbers : ");
		for (i=0;i<5;i++) {
			Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    sum +=n;
		}
		avg=sum/5;
	System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
	}
}