public class FindinMountainArray {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,3,1};
      int target=3;
        System.out.println(search(arr,target));
    }

    static  int search(int arr[],int target){
        int peaks = peak(arr);
        int firstTry = binarySearch(arr,target,0,peaks);
        if(firstTry!=-1){
            return firstTry;
        }
        return  orderAgnostic(arr,target,peaks+1,arr.length-1);
    }
    static int peak(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;

            }
            else{
                start=mid+1;
            }
        }
        return start;
    }


    static  int binarySearch(int arr[],int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static  int orderAgnostic(int arr[],int target,int start,int end){

        while(start>=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;            }
            else if(target>arr[mid]){
               end =mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
