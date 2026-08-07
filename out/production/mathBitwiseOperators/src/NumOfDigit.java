public class NumOfDigit {
    public static void main(String[] args) {
        int n =23;
        int digit = (int)(Math.log(n) / Math.log(2)) + 1;        System.out.println(digit);
    }
}
