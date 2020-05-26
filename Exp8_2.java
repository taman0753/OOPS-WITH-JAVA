import java.util.*;
public class Exp8_2
{
public static void main (String []args)
{
String res="";
Scanner sc= new Scanner(System.in);
System.out.println("Enter a String in lowercase: ");
String str= sc.nextLine();
int a = str.length();
str=str.toUpperCase();
StringBuffer s1= new StringBuffer();
for(int x=0;x<a;x++)
{
s1.append(""+str.charAt(x));
}
res=s1.toString();
System.out.println("String in UPPER CASE: "+res);
}    
}

