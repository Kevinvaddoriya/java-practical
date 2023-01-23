public class pa2{
    public static void main(String[] args) {
        System.out.println("hello");
        for(int i = 0 ;i <= 5;i++){
            for(int k =5;k>i;k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
