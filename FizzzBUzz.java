import java.util.Scanner;

/**
 * FizzzBUzz
 */
public class FizzzBUzz {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++){
            if(i%5==0 && i%3 ==0)
            {
                System.out.println("FIzzBUzz");
            }
            else if(i%5 ==0)
            {
                System.out.println("BUzz ");
            }
            else if(i%3==0)
            {
                System.out.println("fizz");
            }
            else
            System.out.println(i+" ");
        }
        sc.close();
    }
}