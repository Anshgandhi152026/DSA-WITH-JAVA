import java.util.*;
// public class Binarysearch{
//     public static int BinarySearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start<=end){
//             int mid = (start + end)/2;
//                 if(arr[mid] == key){
//                     return mid;
//                 }
//                 else if(arr[mid]<key){
//                     start = mid + 1;
//                 }
//                 else{
//                     end = mid - 1;
//                 }
            
//         }
//         return -1; // means key element not present in array
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the key element to search: ");
//         int key = sc.nextInt();
//         int arr[] = {2,4,6,8,10,12,14,16};
//         int element = BinarySearch(arr, key);
//         if(element == -1){
//             System.out.print(key+" not present in data");
//         }
//         else{
//             System.out.print(key+" found at index "+element);
//         }
//     }
// }


public class Binarysearch{
    public static int binarysearch(int arr[],int key){
        int start = 0; 
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/ 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        int ans = binarysearch(arr, key);
        if(ans == -1){
            System.out.print(key+ " not found");
        }
        else{
            System.out.print(key+ " found at "+ans+"");
        }

    }
}





























