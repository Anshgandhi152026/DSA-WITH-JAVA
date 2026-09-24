

// public class maxsubarrsum{
//     public static void maxsubarraysum(int arr[]){
//         int currsum;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = i; j<arr.length; j++){
//                 int end = j;
//                 currsum = 0;
//                 for(int k = start; k<=end; k++){
//                     // subarray sum
//                     currsum+=arr[k];
//                 }
//                 System.out.println(currsum);

//                 if(maxsum<currsum){
//                     maxsum = currsum;
//                 }
             
//             }
         
//         }

//         System.out.println("The maximum subarray sum is : "+maxsum);

//     }


//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         maxsubarraysum(arr);

//     }
// }




// max sum (brute force approach)

// public class maxsubarrsum{

//     public static void maxsubarraysum(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         int currsum;
//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = i; j<arr.length; j++){
//                 int end = j;
//                 currsum = 0;
//                 for(int k = start; k<=end; k++){
//                     // subarray sum
//                     currsum = currsum + arr[k];
//                 }
//                 System.out.println(currsum);


//                 if(currsum>maxsum){
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.println("The maximum subarray sum is: "+maxsum);
//     }


//     public static void main(String[] args){
//         int arr[] = {1,-3,2};
//         maxsubarraysum(arr);
//     }
// }


// public class maxsubarrsum{
//     public static void maxsubarray(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         int currsum;
//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = i; j<arr.length; j++){
//                 int end = j;
//                 currsum = 0;

//                 for(int k = start; k<=end; k++){
//                     currsum = currsum + arr[k];
//                 }
//                 System.out.println(currsum);


//             if(currsum>maxsum){
//                 maxsum = currsum;
//             }

//             }


//         }
//         System.out.println("The maximum subarr sum is: "+maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,-3,2};
//         maxsubarray(arr);
//     }
// }





// combine all code first print subarrays then subarrays sum then max subarray sum

// public class maxsubarrsum{
//     public static void maxsubarraysum(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         // first print all possible subarrays

//         for(int i = 0; i<arr.length; i++){
//             for(int j = i; j<arr.length; j++){

//                 System.out.print("[");
//                 for(int k = i; k<=j; k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 System.out.println("]");
//             }
//         }



//         System.out.println();

//         // print each subarray and find maxsubarraysum

//         for(int i = 0; i<arr.length; i++){
//             for(int j = i; j<arr.length; j++){
//                 int currsum = 0;
//                 for(int k = i; k<=j; k++){
//                     currsum = currsum + arr[k];
//                 }

//                 System.out.println("subarray sum is: "+currsum);


//                 // find maxsubarray sum
//                 if(currsum>maxsum){
//                     maxsum = currsum;
//                 }
//             }
//         }
//         System.out.println();

//         System.out.println("The maximum subarray sum is: "+maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         maxsubarraysum(arr);
//     }

// }



// maxsum using prefixsum method

public class maxsubarrsum{
    public static void prefixmaxsum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum;
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("The max sum is: "+maxsum);

    }

     public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
     prefixmaxsum(arr);
    }


}




