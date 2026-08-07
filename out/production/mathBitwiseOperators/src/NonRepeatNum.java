public class NonRepeatNum {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,1,4,1,4,4,3,2,5,5};
        int unique=0;
        for(int i =0;i<arr.length-1;i++){
            unique=unique^arr[i];
        }
        System.out.println(unique);
    }
}
