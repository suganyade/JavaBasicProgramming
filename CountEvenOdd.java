public class CountEvenOdd {
    public static void main(String[] args) {
        int arr1[] = {112,233,4,42,12};
        int even =0;
        int odd =0;
        //Count evenandOdd
        for(int i =0;i< arr1.length;i++){

            if(arr1[i]%2==0){
               even++;
            }
            else{
              odd++;
            }
        }
        System.out.println("Even number Count is" + even);
        System.out.println("Odd number Count is "+  odd);
    }
}
