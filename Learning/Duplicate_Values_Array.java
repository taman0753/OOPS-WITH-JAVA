import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int c = 0 ;
				for ( int i =0 ; i<=n-1 ; i++) {
			      System.out.println("Enter the values");
					a[i] = sc.nextInt();	 	
			} 
				
				for ( int i = 0 ; i < n-1 ; i++) {
						for (int j= i+1  ; j<=n-1 ; j++) {
								
							if (a[i] == a[j])
							{
								
								System.out.println("Duplicate value is " + a[i]);
								
							}
							
						}
					
				
				
	
}

	}
}
