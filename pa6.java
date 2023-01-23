
public class pa6 {
    public static void main(String[] args) {
        int n = 5;
        int a = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print((char) (a + j));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (a + j));
            }
            System.out.println();
        }
    }
}
