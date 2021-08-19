import java.util.Scanner;

public class maximum_minimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int max = 0 ; 
		int min = 0;
		int arr[]= new int[n];
		
		System.out.println("Enter the array");
		for ( int i = 0 ; i <=n-1; i++) {
			arr[i]=sc.nextInt()	;
			}
		for (int i =0 ; i<n-1 ; i++) {
			
			if (arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		for (int i =0 ; i<n-1 ; i++) {
			
			if (arr[i]<min) {
				min=arr[i];
			}
			
		}
System.out.println(max);
System.out.println(min);

	}
	
}
