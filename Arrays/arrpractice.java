// import java.util.*;
// public class arrpractice{
//     // public static int linearsearch(int arr[], int key){
//     //     for(int i = 0; i<arr.length; i++){
//     //         if(arr[i] == key){
//     //             return i;
//     //         }
//     //     }
//     //     return -1;
//     // }


//     public static int BinarySearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start<=end){
//             int mid = (start + end)/2;
//             if(arr[mid] == key){
//                 return  mid;
//             }
//             else if(arr[mid]>key){
//                 end = mid - 1;
//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {2,4,6,8,10};
//         System.out.print("Enter the key to search: ");
//         int key = sc.nextInt();
//         // int index = linearsearch(arr, key);
//         // if(index == -1){
//         //     System.out.print(key+" not present in data");
//         // }
//         // else{
//         //     System.out.print(key+" found at "+index+" index");
//         // }


// int ans = BinarySearch(arr, key);
// if(ans == -1){
//     System.out.print(key+ " not present in data");
// }
// else{
//     System.out.print(key+ " found in "+ans+" index");
// }


//     }
// }


