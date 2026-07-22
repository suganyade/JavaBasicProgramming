public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8};
        int arr2[]={98,87,65,42,21};
        int target1=65;
        int target = 7;
        int ans2=binarys(arr2,target1);
        int ans =binarys(arr,target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int binarys(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[start]<arr[end]) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        if(arr[start]>arr[end]){
            while(start<
                    end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid]>target) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        }

        return -1;
    }
}


