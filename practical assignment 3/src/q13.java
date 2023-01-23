public class q13 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Dog";
        StringBuffer c = new StringBuffer();

        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()){
                c.append(a.charAt(i));
            }if (i < b.length()){
                c.append(b.charAt(i));
            }
        }
        System.out.println(c);
    }
}
