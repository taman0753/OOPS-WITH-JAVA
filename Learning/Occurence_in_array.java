import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int c=0;
		
		int a[] = new int[n];
		
				for ( int i =0 ; i<=n-1 ; i++) {
			      System.out.println("Enter the values");
					a[i] = sc.nextInt();	 	
			} 
				System.out.println("Enter the number you want to find");
				int m =sc.nextInt();
				
				for ( int i =0 ; i<n-1 ; i++) {
				    
					if (a[i] == m) {
						c++;
						System.out.println("Occurence is  at " + i + " index" );
				    	
				    }
				    } 
				System.out.println(c + " times is there in the array");
			
	
} }


