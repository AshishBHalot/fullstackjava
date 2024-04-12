public class typecasting {
    public static void main(String[] args) {
        // int intValue=100;
        // long longValue=intValue;            //implicit tyecasting from integer to long
        // double doubleValue=longValue;       //implicit typecasting from long to double
        // System.out.println(intValue);
        // System.out.println(longValue);
        // System.out.println(doubleValue);
        
    
    double doubleValue=200.56;
    int intValue =(int)doubleValue;     //explicit typecasting from double to integer
    byte byteValue=(byte)intValue;


System.out.println(intValue);
System.out.println(doubleValue);
System.out.println(byteValue);

}
}
