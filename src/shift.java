public class shift {
    public static void main(String[] args) {
        int a = 23;
        int b = a >> 2;

        System.out.println(b);

        int c = a << 3;
        System.out.println("left shift "+c);

        int d = a >> 2;
        System.out.println("right shift "+d);
    }
}
