import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int product =1 ;
		for ( int i =0 ; i<=n-1 ; i++) {
			 	System.out.println("Enter the values");
			 	a[i] = sc.nextInt();	
			 	product = product * a[i];
			} 
		
	
		System.out.println(product);
} }


