public class oddOReven {
    public static void main(String[] args) {
        int n=100;
        System.out.println(even(n));
    }
    static  boolean even(int n){
        if((n&1)==1){
            return false;
        }
        return  true;
    }
}
