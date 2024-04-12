import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("enter you age :");
        int age =scanner.nextInt();
        System.out.println("enter your gender");
        char gender= scanner.next().charAt(0);
        System.out.println("enter your contact number");
        double contact=scanner.nextDouble();


        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
        System.out.println("gender : "+ gender);
        System.out.println("contect : "+ contact);

        scanner.close();
    }
}
