

// public class prefixsum{
//     public static void maxsumuseprefix(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         int currsum;
//         int prefix[] = new int [arr.length];
//         prefix[0] = arr[0];
//         // calculate prefix array sum  

//         for(int i = 1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }


//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = i; j<arr.length; j++){
//                 int end = j;
//                 currsum = start == 0? prefix[end]:prefix[end] - prefix[start - 1];


//                 if(maxsum<currsum){
//                     maxsum = currsum;
//                 }
//             }
//         }

//         System.out.println("The max subarray sum is: "+maxsum);

//     }


//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         maxsumuseprefix(arr);
//     }
// }



// public class prefixsum{
//     public static void prefixmaxsum(int arr[]){
//         int currsum;
//         int maxsum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];
//         // calculate prefix sum array
//         prefix[0] = arr[0];

//         for(int i = 1; i<arr.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = 0; j<arr.length; j++){
//                 int end = j;
//                 currsum = start == 0?prefix[end]:prefix[end] - prefix[start - 1];

//                 if(currsum>maxsum){
//                     maxsum = currsum;
//                 }
//             }
//         }

//         System.out.println("The maximum subarray sum is : "+maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         prefixmaxsum(arr);
//     }
// }

