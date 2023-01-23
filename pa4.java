public class pa4 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= 4; j++) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 4; j >= 1; j--) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
