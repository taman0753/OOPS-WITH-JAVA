import java.util.*;
class collision extends Exception
{
collision(String s)
{ super(s); }
}
class Exp7_4
{
public static void main(String ar[])
{
String car1=null,car2=null;
try
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter direction of car1(left/right):");
car1= sc.nextLine();
System.out.println("Enter the direction of car2(left/right):"); 
 car2= sc.nextLine();
if(!car1.equals(car2))
throw new collision("car2 has to go on "+ car1 +" direction");
}
catch(collision e)
{
System.out.println(e); 
car2=car1;
System.out.println("Change the direction of car2");
}
}}

