import java.io.*; 
class student
{
String name,grade; int reg,m1,m2,m3;
void read()throws  Exception
{
DataInputStream in= new DataInputStream(System.in); System.out.println("enter the sapid : "); reg=Integer.parseInt(in.readLine()); System.out.println("enter the name : "); name=in.readLine();
System.out.println("enter mark1 : ");
 
m1=Integer.parseInt(in.readLine()); System.out.println("enter mark2 : "); m2=Integer.parseInt(in.readLine()); System.out.println("enter mark3 : "); m3=Integer.parseInt(in.readLine());
}
public void disp_grade()
{
int tt=m1+m2+m3; if(tt>=250) grade="A";
else if(tt>=200) grade="B"; else if(tt>=150) grade="C"; else if(tt>=100) grade="D"; else grade="E";
System.out.println("Grade   :"+grade);
}
void disp()
{
System.out.println(" MARK LIST OF STUDENTS ");  System.out.println("Sap Id :"+reg); System.out.println("Name :"+name); System.out.println("Mark1 :"+m1);
System.out.println("Mark2 :"+m2); System.out.println("Mark3 :"+m3); disp_grade();
}
}
class Exp7_1
{
public static void main(String ar[])
{
int no=0;
student s=new student(); 
try
{
DataInputStream in= new DataInputStream(System.in); System.out.println("enter the number of students : "); no=Integer.parseInt(in.readLine());
for(int i=0;i<no;i++); s.read();
}
catch(ArrayIndexOutOfBoundsException    e)
{
System.out.println("the maximum students should be ten\n"); no=10;
}
catch(Exception e)
{ System.out.println(e); } for(int i=0;i<no;i++);
s.disp();
}
}



