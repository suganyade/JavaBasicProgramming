public class BitOfNum {
    public static void main(String[] args) {

        int n=30;
        int i =4;
        int bit=(n&(1<<(i-1)));
        System.out.println(bit);
    }
}
