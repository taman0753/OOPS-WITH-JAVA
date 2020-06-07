public class Exp8_6 {
public static void main(String[] args)
{
float f = 100.00f;
float f1 = new Float(f);
System.out.println("Float to Float conversion :"+f1);
 Float fObj = new Float(9.7);
 String str = fObj.toString();
 System.out.println(str);
String str4 = "10000.00";
Float f3 = Float.parseFloat(str4);
System.out.println("String to Float conversion:"+f3);
Float f6 = 12.00f;
System.out.println("Float to String conversion :"+f6);
String str2 = "92.00";
float f7 = Float.parseFloat(str2);
System.out.println("String to Float conversion "+f7);
}
}
