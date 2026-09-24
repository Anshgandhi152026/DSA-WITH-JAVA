// public class secondlargest{
//     public static int secondlarge(int arr[]){
//         int first = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]>first){
//                 first = arr[i];
//             }
//         }




//         int second = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] != first){
//                 second = Math.max(second,arr[i]);
//             }
//         }
//         return second;
//     }
//     public static void main(String[] args) {
//         int arr[] = {12,35,1,10,34,1};
//         int ans = secondlarge(arr);
//         System.out.println("The second largest element in array is: "+ans);
//     }
// }


public class secondlargest{
    public static int secondlarge(int arr[]){
        int first = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>first){
                first = arr[i];
            }
        }
    int second = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        if(arr[i]!= first){
            second = Math.max(second,arr[i]);
        }
    }
    return second;

    }

    public static void main(String[] args) {
        int arr[] = {12,35,45,23,41};
        System.out.println(secondlarge(arr));
    }
}