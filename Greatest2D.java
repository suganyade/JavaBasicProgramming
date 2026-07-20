public class Greatest2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,4},
                {5,62,7},
                {8,9,20}
        };
        int max=0;
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(max<arr[row][column]){
                    max=arr[row][column];
                }
            }
        }
        System.out.println(max);
    }
}
