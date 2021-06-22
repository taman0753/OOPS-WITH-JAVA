public class Arrays {

	public static void main(String[] args) {
		int a[] = { 2,9,3,4,5 };
		int n = a.length;
		for ( int i =0 ; i<n-1 ; i++) {
			
			
		 int minindex = i;
			for ( int j = i; j<n ; j++) {
				 
				if (a[j]< a[minindex]) {
					
					int temp = a[j];
					a[j] = a[minindex];
					a[minindex] = temp;
					 
					
				}
					
		} 
		}
	
		for ( int item: a) {
		System.out.print(item + "  " );
		}
		}
		

	}


