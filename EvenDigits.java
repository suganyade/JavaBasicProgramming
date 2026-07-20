public class EvenDigits {
    public static void main(String[] args) {
        int arr[]={12,23,34,44,323,32};
        int event =0;

        for(int num:arr){
            if(even(num)%2==0){
                event++;
            }
                  }
        System.out.println(event);

    }
    static int even(int nums){
        int count=0;
        while(nums!=0){
            nums=nums/10;
            count++;
        }
        return count;
    }
}
