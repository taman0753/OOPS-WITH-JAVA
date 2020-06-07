import java.io.*;
import java.util.Scanner; 
class Exp8_3
{
public static void main(String a[]) throws IOException
{
Scanner sc= new Scanner(System.in);  
System.out.println("Enter Statement to convert to uppercase:");
String string1= sc.nextLine();
System.out.println("Statement  converted to uppercase: "+string1.toUpperCase());
}
}
