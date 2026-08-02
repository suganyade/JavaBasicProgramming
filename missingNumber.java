import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
      int arr[]={0,3,2};
      int n=sort(arr);
        System.out.println(n);
    }

    static int sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != correct) {
                int temp = arr[i];
                arr[i] = correct;
                correct = temp;
            } else {

                i++;

            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
}
