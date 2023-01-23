public class pa5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n-1;  j>=i ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j < (2*i)-1; j++) {
                System.out.print(j);
            }
            for(int j =2*i-1;j>i-1;j--){
                System.out.print(j);
            }
        System.out.println();

        }
    }
}
