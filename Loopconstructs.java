// import java.util.Scanner;

public class Loopconstructs {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String input=" ";
        // while(!input.equals("quit"))
        // {
        //     System.out.println(" Enter message :");
        //     input=sc.next().toLowerCase();
        //     System.out.println(input);
        // }

        String names[]={"King ","kochhar","sarrah","ashish"};
        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        for(String name :names)
        {
            System.out.println(name);
        }
    }
}
