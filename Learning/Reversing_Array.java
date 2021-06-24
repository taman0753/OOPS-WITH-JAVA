import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for ( int i =0 ; i<=n-1 ; i++) {
			 	System.out.println("Enter the values");
			 	a[i] = sc.nextInt();	
			 	
			} 
		System.out.println("Reverse oredr is");
		for ( int i = n-1 ; i>=0 ; i--)
	    {
	    	
	    	System.out.print(a[i] + " ");
	    }

	
} }


