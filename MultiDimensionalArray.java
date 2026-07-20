import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

           for(int arr1 =0;arr1<arr.length;arr1++){
               System.out.println(Arrays.toString(arr[arr1]));
           }

        sc.close();

    }
}
