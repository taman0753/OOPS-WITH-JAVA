import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0 , min =0;
		int diff;
		for ( int i =0 ; i<=n-1 ; i++) {
			 	System.out.println("Enter the values");
			 	a[i] = sc.nextInt();	
			 	
			} 
		for ( int i =0 ; i<n-1 ; i++) {
		 	if ( a[i+1] > a[i] ) {
		 		 
		 		max = a[i+1];
		  }
		 	else {
		 		max = a[i];
		 	}
			
		} 
		for ( int i =0 ; i<n-1 ; i++) {
		 	if ( a[i+1] < a[i] ) {
		 		 
		 		min = a[i+1];
		  }
		 	else {
		 		min = a[i];
		 	}
			
		} 

//}
System.out.println(max-min);

	
} }


