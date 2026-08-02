public class InfiniteArray {
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,7,8,9,21,65,78,87,88,89,90,91,92,96,97,98,99,100};
         int target=89;
         int ans =search(arr,target);
        System.out.println(ans);
    }

    static int search(int arr[],int target){
        int start=0;
        int end = 1;
        while (end < arr.length - 1 && target > arr[end]) {

            int newStart = end + 1;

            end = end + (end - start + 1) * 2;

            if (end >= arr.length) {
                end = arr.length - 1;
            }

            start = newStart;
        }

        return binary(arr,target,start,end);
    }

    static int binary(int arr[],int target,int start,int end){
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target< arr[mid]) {
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
