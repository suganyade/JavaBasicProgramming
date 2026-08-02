public class pivot {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,0,1,2};
        int target = 5;
        int ans = searchPivot(arr);
        System.out.println(ans);
        int tar= findTarget(arr,target);
        System.out.println(tar);

    }

    static int findTarget(int arr[], int target) {

        int pivot = searchPivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0] && target <= arr[pivot]) {
            return binarySearch(arr, target, 0, pivot);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int searchPivot(int arr[]){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] &&mid < end ){
                return mid;
            }
            if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            else if(arr[start]<arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}