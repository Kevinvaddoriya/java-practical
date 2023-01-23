import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5 {
    public static void main(String[] args) throws IOException {
        int[] a;
        a = new int[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter an element a["+i+"] : ");
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i]>a[j]){
                    int temp = a[i];
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
