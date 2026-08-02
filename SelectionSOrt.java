import java.util.Arrays;

public class SelectionSOrt {
    public static void main(String[] args) {
int arr[]={11,232,45,13,12};
        selection(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){

        for(int i=0;i<arr.length;i++){
            int last =arr.length-i-1;
            int maxIndex=maxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int maxIndex(int[]arr,int start,int end){
        int max=start;
        for(int i =0;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return  max;
    }
}
