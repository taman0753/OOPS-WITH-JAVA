import java.util.*;
 class Exp8_1
{
public static void main(String[]args) throws Exception
{
int length1,length2,last=0;
Scanner sc= new Scanner(System.in); 
System.out.println("Enter the main string:");
String s1= sc.nextLine(); 
System.out.println("Enter the substring to be searched:"); 
String s2= sc.nextLine();
length1=s1.length(); 
length2=s2.length();
for(int i=0;i<=(length1-length2);i++)
{
if(s1.substring(i,length2+i).equals(s2))
{
if(last==0)
System.out.println("First occurance of substring is at :"+(i+1)); last=i+1;
}
}
if(last!=0)
System.out.println("Last occurance of substring is at :"+last); 
else
System.out.println("The substring is not found.");
}
}

