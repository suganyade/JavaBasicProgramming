public class floorNum {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int ans=floors(arr,target);
        if (ans == -1) {
            System.out.println("Ceiling does not exist");
        } else {
            System.out.println("Index = " + ans);
            System.out.println("Ceiling Number = " + arr[ans]);
        }
    }
    static  int floors(int arr[],int target){
        if(target<arr[0]){
            return-1;
        }
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return target;

            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return  end;
    }
}
