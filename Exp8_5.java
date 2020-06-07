public class Exp8_5 {
public static void main(String[] args)
{
int a = 30;
Integer j = a;
System.out.println("Int to Integer:"+j);
Integer a2 = new Integer(10);
String a3 = Integer.toString(a2);
System.out.println(a3);
String str2 = "100";
Integer j2= Integer.parseInt(str2);
System.out.println("String to int:"+j2);
int j3 = 100;
System.out.println("int to String:"+j3);
String str = "100000";
Integer obj2 = Integer.valueOf(str);
System.out.println("String to Integer:" +obj2);
Integer a1 = new Integer(3);
int j1 = a1;
System.out.println(j1);
}
}

