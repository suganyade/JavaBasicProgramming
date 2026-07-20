public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={11,12,2,22,32};
        int target=22;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
