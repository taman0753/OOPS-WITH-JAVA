import java.util.*;
class Exp7_2
{
private static Scanner in;

public static void main(String args[])
{
 int a,b;
float r;
System.out.println("Enter the numerator:");
in = new Scanner(System.in);
b=in.nextInt();
System.out.println("Enter the denominator:");
a=in.nextInt();
try
{
if(a==0)
{System.out.println("Program Terminated");
throw new Exception();
}
if(a!=0)
{
r=b/a;
System.out.println("Answer:"+r);
}
}
catch(Exception e)
{
System.out.println("Exception :Cannot be Divide By Zero");
}
}
}
