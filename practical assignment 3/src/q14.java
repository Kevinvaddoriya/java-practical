import java.util.Scanner;

//Write a java code which accept a string from user and convert the string in upper case and
//display the string in reverse order.
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        StringBuilder Upper = new StringBuilder(a.toUpperCase());
        System.out.println(Upper);
        String rev = String.valueOf(Upper.reverse());
        System.out.println(rev);


    }
}
