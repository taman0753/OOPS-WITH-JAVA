import java.io.*;
import java.util.*;
class Numx
{
	public static void main (String args[]){
 {
String name;
int age;
System.out.println("Enter Name and Age:");
Scanner in=new Scanner(System.in);
try
{
if(!(in.nextLine().matches("[a-zA-Z]+")))
{throw new IOException();}

age=in.nextInt();
if(age>50)
{
System.out.println("Age greater 50 Exception found");
throw new Exception();
}
Numx x=new Numx();
System.out.println("Object Saved");
}
catch(Exception e)
{
System.out.println("Exception found");
}
}
}}
