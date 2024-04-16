public class StringBufferandBUilder {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("hello ");
        // StringBuffer buffer=new StringBuffer();
         System.out.println(buffer.capacity());  //16 bitsis 2 bytes and when append expand the capacity
          buffer.append("world");
          System.out.println(buffer);

        for(int i=0;i<10000;i++){
            buffer.append(" world");
        }

        System.out.println("time : "+ (System.currentTimeMillis()-startTime));



          StringBuilder builder =new StringBuilder("Hello ");
          System.out.println(builder.capacity());
          builder.append("World ");
          System.out.println(builder);
        for(int i=0;i<10000;i++){
            builder.append(" world");
        }System.out.println("time : "+ (System.currentTimeMillis()-startTime));



    }
}
