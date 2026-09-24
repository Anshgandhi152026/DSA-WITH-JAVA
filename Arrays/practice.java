// Binary search

import java.util.*;
public class practice{
    public static int binarysearch(int arr[],int key){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,6,9,31};
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();


        int ans = binarysearch(arr, key);
        if(ans != -1){
            System.out.print("The key found at: "+ans+" index");
        }
        else{
            System.out.print("Key not found");
        }
    }
}