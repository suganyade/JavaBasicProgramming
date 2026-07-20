public class RichestCommonwealth {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,98,76},{11,22,33}};
        int max=0;
        for(int i =0;i<arr.length;i++){
            int sum=0;

            for(int count:arr[i]){
                sum+=count;
                if(sum>max){
max=sum;
                }
            }

        }
        System.out.println(max);
    }
}
