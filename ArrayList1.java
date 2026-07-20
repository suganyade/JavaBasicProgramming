import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(8);
        System.out.println(arr);
        arr.add(4,12);
        arr.get(3);
        arr.size();
        arr.addFirst(33);
        arr.addLast(23);
        System.out.println(arr);
      /*  for(int i =0;i<arr.size();i++){
            System.out.println(arr);
        }

       */

    }
}
