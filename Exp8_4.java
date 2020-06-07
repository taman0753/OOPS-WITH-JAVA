class Exp8_4
{
String name;
Exp8_4(String n)
{
	name=n; 
} 
void disp()
{
System.out.println("Name   :"+name);
int c=0;
int len=name.length(); 
	for(int i=0;i<len;i++)
if(name.charAt(i)=='A'||name.charAt(i)=='a')
{ 
c++;
System.out.println("Number of occurance of a :"+c); 
System.out.println("Possition of a :"+(i+1));
}
if(c==0)
System.out.println("There is no occurence of 'a'");
}
}
class Exp8
{
public static void main(String ar[])
{
Exp8_4 d1=new Exp8_4("Aman Tyagi"); 
d1.disp();
Exp8_4 d2=new Exp8_4("Devops");
d2.disp();
}
}
