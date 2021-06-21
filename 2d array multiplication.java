import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of rows for first matrices");
		int r1 = sc.nextInt();
		System.out.println("Enter number of column for first matrices");
		int c1 = sc.nextInt();
		int a[][] = new int[r1][c1];
		System.out.println("Enter number of rows for second matrices");
		int r2 = sc.nextInt();
		System.out.println("Enter number of column for second matrices");
		int c2 = sc.nextInt();
		int b[][] = new int[r2][c2];
		if ( c1 == r2) {
		System.out.println("Enter the value of first array");
		for ( int i =0 ; i<r1 ; i++ )
		{
			for ( int j =0; j<c1 ; j++)
		{
			
			a[i][j] = sc.nextInt();
		} }
		System.out.println("Enter the value of second array");
		for ( int i =0 ; i<r2 ; i++ )
{
			for ( int j =0; j<c2 ; j++)
		{
			
			b[i][j] = sc.nextInt();
		} }
		
		int product[][]= new int [r1][c2];
		
		for ( int i =0 ; i<r1 ; i++ ) {
			for ( int j =0; j<c2 ; j++)
		{
			for ( int k=0 ; k<c1 ; k++) {
			product[i][j] += a[i][k] * b[k][j];
		} } }
		
		for ( int i =0 ; i<r1 ; i++ ) {
			for ( int j =0; j<c2 ; j++)
		{
			System.out.print(product[i][j] + " ");
			
		} 
		System.out.println();
		}
		
}}}
