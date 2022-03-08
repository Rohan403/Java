
/*Write a program to input employee details*/

import java.util.Scanner;

public class scanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your Gender");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your phone Number:");
        long phonenumber = sc.nextLong();
        System.out.println("Employee details are:");

        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("age" + age);
        System.out.println("Phone Number:" + phonenumber);
    }
}
