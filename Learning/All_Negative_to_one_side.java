import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		
				for ( int i =0 ; i<=n-1 ; i++) {
			      System.out.println("Enter the values");
					a[i] = sc.nextInt();	 	
			} 
				
				for ( int i =0 ; i<n-1 ; i++) {
						for ( int j = i ; j <n-1 ; j++) {
							if (a[j]<0) {
								
								int temp = a[i];
								a[i] = a[j];
								a[j] = temp;  }
							}
				    }
				
				for ( int item: a) {
					
					
					System.out.print(item + " ");
				}
			
				
				    } 
				
	
}


