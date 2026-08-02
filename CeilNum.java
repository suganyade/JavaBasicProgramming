public class CeilNum {
    public static void main(String[] args) {
        int arr[]={4,5,8,11,13,15};
        int target=12;
        int ans=ceil(arr,target);
        if (ans == -1) {
            System.out.println("Ceiling does not exist");
        } else {
            System.out.println("Index = " + ans);
            System.out.println("Ceiling Number = " + arr[ans]);
        }
    }
    static int ceil(int arr[],int target){

        if(target>arr[arr.length-1]){
            return -1;
        }int start=0;
        int end =arr.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
             if(target<arr[mid]){
                end =mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}