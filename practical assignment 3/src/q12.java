import java.util.Scanner;

public class q12 {

    public static void main(String[] args){
        int size = 5;
        int index_of ;

        String[] name = new String[size];
        String[] surname = new String[size];
        String patel = "patel";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 names : ");

        for (int i = 0 ; i < name.length;i++){
            name[i] = sc.nextLine();
        }

        System.out.println("these are the name whose surname is patel.");

        for (int i = 0; i < name.length; i++) {
            surname[i] = name[i].toLowerCase();
            index_of = surname[i].indexOf(patel);

            if (index_of != -1){
                System.out.println(name[i]);
            }
        }
        sc.close();
    }

}
