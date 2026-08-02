import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int arr[][]={
                {1,3},

        };
        int target=3;
int ans[]=searching(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searching(int arr[][],int target){
        int row= 0;
        int column= arr[0].length-1;
        while(row<arr.length && column>=0){
            if(arr[row][column]==target){
                return  new int[]{row,column};
            }
            else if(target<arr[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        return  new int[]{-1,-1};
    }
}
