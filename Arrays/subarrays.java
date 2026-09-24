// public class subarrays{
//     public static void printSubarrs(int numbers[]){
//         int count = 0;
//         for(int i = 0; i<numbers.length; i++){
//             int start = i;
//             for(int j = i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k = start; k<=end; k++){
//                     System.out.print(numbers[k]+" ");
//                 }
//                 System.out.println();
//                 count++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarrays are: "+count);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         printSubarrs(numbers);
//     }
// }



// public class subarrays{
//     public static void printSubarrs(int arr[]){
//         int count = 0;
//         for(int i = 0; i<arr.length; i++){
//             int start = i;
//             for(int j = i; j<arr.length; j++){
//                 int end = j;
//                 for(int k = start; k<=end; k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 System.out.println();
//                 count++;
//             }
//             System.out.println();
//         }
//         System.out.print("The total subarrays are: "+count);
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10};
//         printSubarrs(arr);
//     }
// }


// public class subarrays {
//     public static void printSubarrSums(int arr[]) {
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int start = i;

//             for (int j = i; j < arr.length; j++) {
//                 int end = j;
//                 int sum = 0;

//                 // calculate sum of subarray
//                 for (int k = start; k <= end; k++) {
//                     sum += arr[k];
//                 }

//                 System.out.println("Subarray sum (" + start + "," + end + ") = " + sum);
//                 count++;
//             }
//             System.out.println();
//         }

//         System.out.println("The total subarrays are: " + count);
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 4, 6, 8, 10};
//         printSubarrSums(arr);
//     }
// }







