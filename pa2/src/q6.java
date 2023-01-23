import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q6 {
    public static void main(String[] args) throws IOException {
        String[] a;
        a = new String[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter an element a["+i+"] : ");
            a[i] = br.readLine();
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if ((a[i]).compareTo(a[j])>0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter an element a["+i+"] : "+a[i]);
        }
    }
}
