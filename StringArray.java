import java.lang.reflect.Array;
import java.util.Arrays;
import  java.util.Scanner;
public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[]= new String[3];
        for(int i =0;i<s.length;i++){
            s[i]=sc.next();
        }
        System.out.println(Arrays.toString(s));
    }
}
