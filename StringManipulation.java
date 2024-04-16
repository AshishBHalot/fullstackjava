public class StringManipulation {
    public static void main(String[] args) {
String str1="hello ";//string literal
System.out.println(str1);
String str2=new String("world");//string object
System.out.println(str2);

//concatenating string literal and object
String str3=str1+str2;
System.out.println(str3);
System.out.println(str3.length());
System.out.println(str3.charAt(0));
System.out.println(str1.concat(str2));
System.out.println(str3.substring(0, 5));
System.out.println(str1.equals(str2));
System.out.println(str3.contains("hello"));
System.out.println(str2.toUpperCase());
System.out.println("  trim : "+str3.trim());



    }
}
